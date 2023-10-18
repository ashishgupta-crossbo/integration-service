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
public class AvailableRoom {
    @JsonProperty("room_type_code")
    private String roomTypeCode;

    @JsonProperty("available_plans")
    private List<AvailablePlan> availablePlans;
}
