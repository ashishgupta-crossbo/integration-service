package com.micronaut.integration.validations;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.exceptions.CustomException;
import jakarta.inject.Singleton;

@Singleton
public class HotelAvailabilityValidations {

    public void validate( int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId, int numRooms, String startDate, String endDate) {

        if (adults==0 || chainId==0 || hotelId==0 || numRooms==0 || primaryChannel.isEmpty() || secondaryChannel.isEmpty() ||
                startDate.isEmpty() || endDate.isEmpty()){
            throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
        }
    }
}
