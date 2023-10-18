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
public class Monthly {
    @JsonProperty("EndDate")
    public String endDate;
    @JsonProperty("StartDate")
    public String startDate;
    @JsonProperty("Price")
    public Price price;
}
