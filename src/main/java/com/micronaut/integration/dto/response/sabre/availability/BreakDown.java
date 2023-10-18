package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString

public class BreakDown {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Points")
    public int points;
    @JsonProperty("IsPayAtProperty")
    public boolean isPayAtProperty;
    @JsonProperty("IsPerStay")
    public boolean isPerStay;
}
