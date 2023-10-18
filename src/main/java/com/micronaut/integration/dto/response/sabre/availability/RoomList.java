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
public class RoomList {
    @JsonProperty("CategoryCode")
    public String categoryCode;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("PmsCode")
    public String pmsCode;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("Details")
    public Details details;
}
