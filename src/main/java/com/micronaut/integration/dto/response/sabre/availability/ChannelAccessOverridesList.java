package com.micronaut.integration.dto.response.sabre.availability;

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

public class ChannelAccessOverridesList {
    public String accessCode;
    public String name;
}
