package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString
public class LeastRestrictiveFailure {
    @JsonProperty("Date")
    public String date;
    @JsonProperty("OverrideAllowed")
    public boolean overrideAllowed;
    @JsonProperty("AdditionalInformation")
    public String additionalInformation;
    @JsonProperty("Level")
    public String level;
    @JsonProperty("ProductStatus")
    public String productStatus;
}
