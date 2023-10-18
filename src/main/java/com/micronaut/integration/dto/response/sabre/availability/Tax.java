package com.micronaut.integration.dto.response.sabre.availability;

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
public class Tax {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("StayTaxAmount")
    public int stayTaxAmount;
    @JsonProperty("BreakDown")
    public List<BreakDown> breakDown;
    @JsonProperty("Points")
    public int points;
}
