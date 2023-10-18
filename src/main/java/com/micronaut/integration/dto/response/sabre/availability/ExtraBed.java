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
@ToString
@Introspected
public class ExtraBed {
    @JsonProperty("Allowed")
    public boolean allowed;
    @JsonProperty("Cost")
    public int cost;
}
