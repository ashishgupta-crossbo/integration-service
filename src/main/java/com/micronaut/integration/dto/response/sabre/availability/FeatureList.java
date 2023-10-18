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

public class FeatureList {
    @JsonProperty("CategoryCode")
    public String categoryCode;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OtaCode")
    public int otaCode;
    @JsonProperty("OtaType")
    public String otaType;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("UnitOfMeasurement")
    public String unitOfMeasurement;
    @JsonProperty("Value")
    public int value;
}
