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
public class ViewList {
    @JsonProperty("Code")
    public String code;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OtaCode")
    public int otaCode;
    @JsonProperty("OtaType")
    public String otaType;
    @JsonProperty("OtaReferenceCode")
    public String otaReferenceCode;
    @JsonProperty("IsGDSPreferred")
    public boolean isGDSPreferred;
}
