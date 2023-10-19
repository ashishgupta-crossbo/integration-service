package com.micronaut.integration.configuration;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.dto.response.availability.*;
import com.micronaut.integration.dto.response.sabre.availability.SabreAvailabilityRoomResponse;
import com.micronaut.integration.exceptions.CustomException;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class SabreServiceProviderStrategy implements HotelServiceProviderStrategy{

    private final ServiceClientConfig sabreClientConfig;

    @Value("${sabre.service.availability.baseUrl}")
    private String baseUrl;

    private static final Logger logger = LoggerFactory.getLogger(SabreServiceProviderStrategy.class.getName());

    @Inject
    private final WebClientConfiguration webClientConfiguration;

    public SabreServiceProviderStrategy(ServiceClientConfig sabreClientConfig, WebClientConfiguration webClientConfiguration) {
        this.sabreClientConfig = sabreClientConfig;
        this.webClientConfiguration = webClientConfiguration;
    }

    @Override
    public AvailabilityRoomResponse availability(int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId, int numRooms, String startDate, String endDate) {
        AvailabilityRoomResponse availabilityRoomResponse = null;
        try {
            String url= encodeQueryParameters(adults,chainId,primaryChannel,secondaryChannel,hotelId,numRooms,startDate,endDate);
            SabreAvailabilityRoomResponse response = webClientConfiguration.getHttpClient(url,SabreAvailabilityRoomResponse.class).body();
            if (response != null) {
                logger.info("Response is {}", response);
                availabilityRoomResponse = setAvailabilityResponse(response);
                if (availabilityRoomResponse == null) {
                    throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
                }
            }
        }catch (Exception e) {
            logger.info("Getting error in roomAvailability function {}", e.getMessage());
            throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
        }
        return availabilityRoomResponse;
    }

    public AvailabilityRoomResponse setAvailabilityResponse(SabreAvailabilityRoomResponse response) {
        AvailabilityRoomResponse availabilityResponse= AvailabilityRoomResponse.builder().availabilityPrice(new ArrayList<>()).build();
        AvailabilityPrice availabilityPrice= AvailabilityPrice.builder().hotelCode(String.valueOf(response.productAvailability.hotel.getId())).availableRooms(new ArrayList<>()).build();
        AvailableRoom availableRoomData= AvailableRoom.builder().roomTypeCode(response.productAvailability.additionalPrices.get(0).getRoom().getCode()).availablePlans(new ArrayList<>()).build();

        AvailablePlan availablePlanData= AvailablePlan.builder().ratePlanCode(response.productAvailability.additionalPrices.get(0).getRate().getCode())
                .totalAmountBeforeTax(response.productAvailability.additionalPrices.get(0).getPerGuest().get(0).getPrice().getTotal().getAmount()).totalAmountAfterTax(response.productAvailability.additionalPrices.get(0).
                        getPerGuest().get(0).getPrice().getTotal().amountWithTaxesFees).totalTaxAmount(response.productAvailability.additionalPrices.get(0).
                        getPerGuest().get(0).getPrice().getTotal().getAmount()).mealPlanCode(response.getContentLists().
                        rateList.get(0).getDetails().mealPlan.getCode()).numberOfUnitAvailable(String.valueOf(response.productAvailability.
                        getPrices().get(0).availableInventory)).maxOccupancy(String.valueOf(response.getContentLists().roomList.get(0).getDetails().getGuestLimit().guestLimitTotal)).
                currencyCode(response.getContentLists().getCurrencyList().get(0).getCurrencyCode()).
                ratePlanName(response.contentLists.rateList.get(0).getName()).ratePlanDesc(response.getContentLists().rateList.get(0).getDetails().getDescription()).planFeatures(Collections.singletonList(PlanFeature.builder().code(response.getContentLists().
                        rateList.get(0).getPackageList().get(0).getCode()).desc(response.getContentLists().
                        rateList.get(0).getPackageList().get(0).getDescription()).build())).build();

        CancellationPolicy cancellationPolicy = getCancellationPolicy(response);
         availablePlanData.setCancellationPolicy(cancellationPolicy);

        GuaranteePolicy guaranteePolicy= GuaranteePolicy.builder().policyCode(response.contentLists.getPolicyList().getBookingPolicy().get(0).getCode()).guaranteeAmount(344).policyText(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDescription())
                .currencyCode(response.getContentLists().getCurrencyList().get(0).getCurrencyCode()).build();
        availablePlanData.setGuaranteePolicy(guaranteePolicy);

        availablePlanData.setTaxes(new ArrayList<>());
        Taxis.builder().amount(response.productAvailability.additionalPrices.get(0).getPerGuest().get(0).getPrice().getTotal().getAmount())
                .taxName(response.productAvailability.getPrices().get(0).getProduct().getPrices().getTotal().getPrice().getTax().getBreakDown().get(0).getCode())
                .otaTaxCode(response.productAvailability.getPrices().get(0).getProduct().getPrices().getTotal().getPrice().getTax().getBreakDown().get(0).getCode())
                .chargeFrequency(123)  // need to be discussed
                .date(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDepositFee().getDueTime())
                .build();
        availablePlanData.setNightlyRates(new ArrayList<>());
        NightlyRate rate= NightlyRate.builder().total(response.productAvailability.getPrices().get(0).getProduct().prices.getPerNight().getPrice().getAmount()).
                tax(response.productAvailability.getPrices().get(0).getProduct().prices.getPerNight().getPrice().tax.getAmount()).
                price(response.productAvailability.getPrices().get(0).getProduct().prices.getPerNight().getPrice().amount).fee(response.productAvailability.getPrices().get(0).getProduct().prices.getPerNight().getPrice().fees.getAmount()).
                date(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDepositFee().getDueTime()).build();
        availablePlanData.getNightlyRates().add(rate);

        availableRoomData.getAvailablePlans().add(availablePlanData);
        availabilityPrice.getAvailableRooms().add(availableRoomData);
        availabilityResponse.getAvailabilityPrice().add(availabilityPrice);
        return availabilityResponse;
    }

    private static CancellationPolicy getCancellationPolicy(SabreAvailabilityRoomResponse response) {

        return CancellationPolicy.builder().cancellationAllowed(response.getContentLists().getPolicyList().getCancelPolicy().get(0).cancellationPermitted).policyCode(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getCode())
                .policyText(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDescription()).currencyCode(response.getContentLists().getCurrencyList().get(0).getCurrencyCode())
                .penaltyAmount(response.getContentLists().getPolicyList().getCancelPolicy().get(0).cancelFeeAmount.getValue()).absoluteDeadlineDateTime(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDepositFee().getDueTime())
                .penaltyInclusiveTax(response.getContentLists().getPolicyList().getBookingPolicy().get(0).getDepositFee().taxInclusive).build();
    }

    private String encodeQueryParameters(int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId,
                                         int numRooms, String startDate, String endDate) {
        String encodedAdults = URLEncoder.encode(String.valueOf(adults), StandardCharsets.UTF_8);
        String encodedChainId = URLEncoder.encode(String.valueOf(chainId), StandardCharsets.UTF_8);
        String encodedPrimaryChannel = URLEncoder.encode(primaryChannel, StandardCharsets.UTF_8);
        String encodedSecondaryChannel = URLEncoder.encode(secondaryChannel, StandardCharsets.UTF_8);
        String encodedHotelId = URLEncoder.encode(String.valueOf(hotelId), StandardCharsets.UTF_8);
        String encodedNumRooms = URLEncoder.encode(String.valueOf(numRooms), StandardCharsets.UTF_8);
        String encodedStartDate = URLEncoder.encode(startDate, StandardCharsets.UTF_8);
        String encodedEndDate = URLEncoder.encode(endDate, StandardCharsets.UTF_8);

        return baseUrl + sabreClientConfig.getSabreService().getAvailabilityUrl()+
                "?adults=" + encodedAdults +
                "&chainId=" + encodedChainId +
                "&primaryChannel=" + encodedPrimaryChannel +
                "&secondaryChannel=" + encodedSecondaryChannel +
                "&hotelId=" + encodedHotelId +
                "&numRooms=" + encodedNumRooms +
                "&startDate=" + encodedStartDate +
                "&endDate=" + encodedEndDate;

    }


}
