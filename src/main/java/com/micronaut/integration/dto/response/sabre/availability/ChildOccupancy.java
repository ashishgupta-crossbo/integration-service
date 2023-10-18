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

public class ChildOccupancy {
    @JsonProperty("AgeRange")
    public AgeRange ageRange;
    @JsonProperty("LimitedByAgeRange")
    public boolean limitedByAgeRange;
    @JsonProperty("QuantityAllowed")
    public int quantityAllowed;
}
