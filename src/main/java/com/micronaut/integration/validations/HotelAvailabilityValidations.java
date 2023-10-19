package com.micronaut.integration.validations;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.dto.request.HotelAvailabilityRequest;
import com.micronaut.integration.exceptions.InvalidRequestException;
import io.micronaut.core.util.StringUtils;
import jakarta.inject.Singleton;

@Singleton
public class HotelAvailabilityValidations {

    public void validateHotelAvailabilityRequest(HotelAvailabilityRequest hotelAvailabilityRequest) {

        if (hotelAvailabilityRequest.getAdults()==0 || hotelAvailabilityRequest.getChainId()==0 || StringUtils.isEmpty( hotelAvailabilityRequest.getHotelId())||
                hotelAvailabilityRequest.getNumRooms()==0 || StringUtils.isEmpty( hotelAvailabilityRequest.getPrimaryChannel()) ||
                StringUtils.isEmpty( hotelAvailabilityRequest.getSecondaryChannel()) ||
                StringUtils.isEmpty( hotelAvailabilityRequest.getStartDate()) ||StringUtils.isEmpty( hotelAvailabilityRequest.getEndDate())){
            throw new InvalidRequestException(ErrorCode.INVALID_REQUEST);
        }
    }
}
