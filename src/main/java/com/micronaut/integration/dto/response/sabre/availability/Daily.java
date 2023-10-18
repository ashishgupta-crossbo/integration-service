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

public class Daily {
    @JsonProperty("Date")
    public String date;
    @JsonProperty("AvailableInventory")
    public int availableInventory;
    @JsonProperty("OriginalPrice")
    public OriginalPrice originalPrice;
    @JsonProperty("Price")
    public Price price;
}
