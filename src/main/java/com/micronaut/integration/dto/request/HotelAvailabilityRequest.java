package com.micronaut.integration.dto.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Serdeable
@Introspected
public class HotelAvailabilityRequest {
    private int adults;
    private Long chainId;
    private String primaryChannel;
    private String secondaryChannel;
    private String hotelId;
    private int numRooms;
    private String startDate;
    private String endDate;
}
