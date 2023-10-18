package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.convert.format.Format;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString
public class Validity {
    @JsonProperty("End")
    @Format("yyyy-MM-dd'T'HH:mm:ss")
    public String end;
    @JsonProperty("Start")
    public String start;
}
