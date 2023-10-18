package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString
public class RateList {
    @JsonProperty("CategoryCode")
    public String categoryCode;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("CurrencyCode")
    public String currencyCode;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("RevenueType")
    public String revenueType;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("Details")
    public Details details;
    @JsonProperty("PackageList")
    public List<PackageList> packageList;
}
