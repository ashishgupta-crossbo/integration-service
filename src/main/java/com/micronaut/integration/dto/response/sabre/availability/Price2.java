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
public class Price2 {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("CurrencyCode")
    public String currencyCode;
    @JsonProperty("Points")
    public int points;
    @JsonProperty("Fees")
    public Fees fees;
    @JsonProperty("Tax")
    public Tax tax;
    @JsonProperty("Total")
    public Total total;
    @JsonProperty("Average")
    public Average average;
}
