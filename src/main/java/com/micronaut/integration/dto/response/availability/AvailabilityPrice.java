package com.micronaut.integration.dto.response.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString
@Builder
public class AvailabilityPrice {

    @JsonProperty("hotel_code")
    public String hotelCode;

    @JsonProperty("available_rooms")
    public List<AvailableRoom> availableRooms;
}
