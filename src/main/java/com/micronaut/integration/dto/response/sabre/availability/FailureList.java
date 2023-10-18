package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString

public class FailureList {
    @JsonProperty("Date")
    public String date;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Level")
    public String level;
    @JsonProperty("OverrideAllowed")
    public boolean overrideAllowed;
    @JsonProperty("Value")
    public String value;
}
