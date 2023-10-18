package com.micronaut.integration.dto.response.availability;

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
@Builder
public class Taxis {
    private double amount;

    @JsonProperty("tax_name")
    private String taxName;

    @JsonProperty("ota_tax_code")
    private String otaTaxCode;

    @JsonProperty("charge_frequency")
    private int chargeFrequency;

    private String date;
}
