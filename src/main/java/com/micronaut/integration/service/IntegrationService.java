package com.micronaut.integration.service;
import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;
import com.micronaut.integration.dto.response.sabre.availability.SabreAvailabilityRoomResponse;

public interface IntegrationService {
    AvailabilityRoomResponse roomAvailability(int adults, long chainId, String primaryChannel, String secondaryChannel, int hotelId,
                                              int numRooms, String startDate, String endDate);
}
