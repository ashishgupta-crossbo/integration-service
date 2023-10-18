package com.micronaut.integration.dto.response.availability;

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
@Builder
public class NightlyRate {
    private String date;
    private int fee;
    private int price;
    private int tax;
    private int total;
}
