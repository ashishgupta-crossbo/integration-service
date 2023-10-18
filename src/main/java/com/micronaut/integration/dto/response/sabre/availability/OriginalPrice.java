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
public class OriginalPrice {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("CurrencyCode")
    public String currencyCode;
    @JsonProperty("IsSlashThrough")
    public boolean isSlashThrough;
    @JsonProperty("Points")
    public int points;
    @JsonProperty("Fees")
    public Fees fees;
    @JsonProperty("Tax")
    public Tax tax;
    @JsonProperty("Total")
    public Total total;
}
