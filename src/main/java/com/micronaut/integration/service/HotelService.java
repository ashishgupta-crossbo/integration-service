package com.micronaut.integration.service;
import com.micronaut.integration.dto.request.HotelAvailabilityRequest;
import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;

public interface HotelService {
    AvailabilityRoomResponse roomAvailability(HotelAvailabilityRequest hotelAvailabilityRequest);
}
