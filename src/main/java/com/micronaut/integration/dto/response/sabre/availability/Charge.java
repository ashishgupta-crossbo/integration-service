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

public class Charge {
    @JsonProperty("DaysToArrive")
    public int daysToArrive;
    @JsonProperty("CancelFeeIncludesTax")
    public boolean cancelFeeIncludesTax;
    @JsonProperty("CancelFeeAmount")
    public int cancelFeeAmount;
}
