package com.micronaut.integration.dto.request;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Introspected
@Serdeable
@Builder
public class AvailableRoomRequest {

    private int adults;

    private long chainId;

    private String primaryChannel;

    private String secondaryChannel;

    private int hotelId;

    private int numRooms;

    private String startDate;

    private String endDate;


}
