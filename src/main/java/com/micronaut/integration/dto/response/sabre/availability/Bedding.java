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

public class Bedding {
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsPrimary")
    public boolean isPrimary;
    @JsonProperty("Quantity")
    public int quantity;
    @JsonProperty("Type")
    public String type;
}
