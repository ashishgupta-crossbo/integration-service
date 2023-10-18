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
public class CustLoyaltyList {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ProgramID")
    public String programID;
    @JsonProperty("Level")
    public List<Level> level;
}
