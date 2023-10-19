package com.micronaut.integration.controller;
import com.micronaut.integration.dto.request.HotelAvailabilityRequest;
import com.micronaut.integration.dto.response.BaseResponse;
import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;
import com.micronaut.integration.service.HotelService;
import com.micronaut.integration.validations.HotelAvailabilityValidations;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

@Controller("/integration")
@ExecuteOn(TaskExecutors.IO)
public class HotelController {

    @Inject
    private final HotelService integrationService;

    private final HotelAvailabilityValidations validations;

    public HotelController(HotelService integrationService, HotelAvailabilityValidations validations) {
        this.integrationService = integrationService;
        this.validations = validations;
    }

    @Get("/roomAvailability")
    public HttpResponse<BaseResponse<AvailabilityRoomResponse>> roomAvailability(@QueryValue int adults, @QueryValue Long chainId,
                                                                                      @QueryValue String primaryChannel, @QueryValue String secondaryChannel,
                                                                                      @QueryValue String hotelId, @QueryValue int numRooms,
                                                                                      @QueryValue String startDate, @QueryValue String endDate) {
     HotelAvailabilityRequest hotelAvailabilityRequest = HotelAvailabilityRequest.builder().adults(adults).chainId(chainId).primaryChannel(primaryChannel).secondaryChannel(secondaryChannel).hotelId(hotelId).numRooms(numRooms).startDate(startDate).endDate(endDate).build();
     validations.validateHotelAvailabilityRequest(hotelAvailabilityRequest);
     AvailabilityRoomResponse response = integrationService.roomAvailability(hotelAvailabilityRequest);
        return HttpResponse.ok(new BaseResponse<>(response));
    }

}
