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
public class RoomCategoryList {
    @JsonProperty("CategoryCode")
    public String categoryCode;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Details")
    public Details details;
}
