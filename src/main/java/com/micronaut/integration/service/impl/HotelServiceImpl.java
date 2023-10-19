package com.micronaut.integration.service.impl;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.common.HotelServiceEnums;
import com.micronaut.integration.configuration.HotelServiceProviderStrategy;
import com.micronaut.integration.configuration.SabreServiceProviderStrategy;
import com.micronaut.integration.configuration.ServiceClientConfig;
import com.micronaut.integration.configuration.WebClientConfiguration;
import com.micronaut.integration.dto.request.HotelAvailabilityRequest;
import com.micronaut.integration.dto.response.availability.*;
import com.micronaut.integration.exceptions.InternalServerException;
import com.micronaut.integration.exceptions.InvalidRequestException;
import com.micronaut.integration.exceptions.InvalidServiceProviderException;
import com.micronaut.integration.service.HotelService;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Singleton
public class HotelServiceImpl implements HotelService {

    private final ServiceClientConfig serviceClientConfig;
    private final WebClientConfiguration webClientConfiguration;

    private static final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class.getName());

    public HotelServiceImpl(ServiceClientConfig serviceClientConfig, WebClientConfiguration webClientConfiguration) {
        this.serviceClientConfig = serviceClientConfig;
        this.webClientConfiguration = webClientConfiguration;
    }

    @Override
    public AvailabilityRoomResponse roomAvailability( HotelAvailabilityRequest hotelAvailabilityRequest ) {

        Optional<HotelServiceProviderStrategy> hotelServiceProviderStrategyOptional = getHotelServiceProviderStrategy();
        if (hotelServiceProviderStrategyOptional.isEmpty()){
        throw new InvalidServiceProviderException(ErrorCode.INVALID_SERVICE_PROVIDER_EXCEPTION);
        }
        HotelServiceProviderStrategy hotelServiceProviderStrategy=hotelServiceProviderStrategyOptional.get();
        AvailabilityRoomResponse response;
        try {
            response = hotelServiceProviderStrategy.availability(hotelAvailabilityRequest);
            }catch (Exception e) {
            logger.info("Getting error in roomAvailability function {}", e.getMessage());
            throw new InternalServerException(ErrorCode.INTERNAL_SERVER_EXCEPTION);
        }
        return response;
    }

    private Optional<HotelServiceProviderStrategy> getHotelServiceProviderStrategy(){
        if ("SABRE".equals(HotelServiceEnums.SABRE.toString())){
            return Optional.of(new SabreServiceProviderStrategy(serviceClientConfig, webClientConfiguration));
        }
        return Optional.empty();
    }
}
