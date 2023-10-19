package com.micronaut.integration.configuration;

import com.micronaut.integration.dto.request.HotelAvailabilityRequest;
import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;

public interface HotelServiceProviderStrategy {

    AvailabilityRoomResponse availability( HotelAvailabilityRequest hotelAvailabilityRequest );
}
