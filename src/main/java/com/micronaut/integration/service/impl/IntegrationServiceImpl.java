package com.micronaut.integration.service.impl;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.common.HotelServiceEnums;
import com.micronaut.integration.configuration.HotelServiceProviderStrategy;
import com.micronaut.integration.dto.response.availability.*;
import com.micronaut.integration.exceptions.CustomException;
import com.micronaut.integration.service.IntegrationService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class IntegrationServiceImpl implements IntegrationService {
    private static final Logger logger = LoggerFactory.getLogger(IntegrationServiceImpl.class.getName());

    @Inject
    private  HotelServiceProviderStrategy hotelServiceProviderStrategy;

    @Override
    public AvailabilityRoomResponse roomAvailability(int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId,
                                                          int numRooms, String startDate, String endDate) {
        AvailabilityRoomResponse response;
        try {
            if ("SABRE".equals(HotelServiceEnums.SABRE.toString())) {
                 response = hotelServiceProviderStrategy.availability(adults,chainId,primaryChannel,secondaryChannel,hotelId,numRooms,startDate,endDate);
            }else {
                throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
            }
            }catch (Exception e) {
            logger.info("Getting error in roomAvailability function {}", e.getMessage());
            throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
        }
        return response;
    }
}
