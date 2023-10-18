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
public class SabreAvailabilityRoomResponse {
    public ContentLists contentLists;
    public ProductAvailability productAvailability;
    @JsonProperty("Warning")
    public List<Warning> warning;
}
