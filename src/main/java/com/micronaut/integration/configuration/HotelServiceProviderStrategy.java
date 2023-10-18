package com.micronaut.integration.configuration;

import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;

public interface HotelServiceProviderStrategy {

    AvailabilityRoomResponse availability(int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId, int numRooms, String startDate, String endDate);
}
