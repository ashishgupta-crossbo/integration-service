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
public class Total {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("AmountWithTaxesFees")
    public int amountWithTaxesFees;
    @JsonProperty("AmountWithInclusiveTaxes")
    public int amountWithInclusiveTaxes;
    @JsonProperty("Points")
    public int points;
    @JsonProperty("AmountPayableNow")
    public int amountPayableNow;
    @JsonProperty("AmountPayAtProperty")
    public int amountPayAtProperty;
    @JsonProperty("OriginalPrice")
    public OriginalPrice originalPrice;
    @JsonProperty("Price")
    public Price price;
    @JsonProperty("Fees")
    public Fees fees;
}
