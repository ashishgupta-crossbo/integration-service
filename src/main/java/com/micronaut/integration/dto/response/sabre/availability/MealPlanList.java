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
public class MealPlanList {
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Chargeable")
    public boolean chargeable;
    @JsonProperty("Charge")
    public int charge;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("GDSdescription")
    public String gDSdescription;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Date")
    public String date;
}

