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

public class DepositFee {
    @JsonProperty("Amount")
    public int amount;
    @JsonProperty("DueDays")
    public int dueDays;
    @JsonProperty("DueTime")
    public String dueTime;
    @JsonProperty("DueType")
    public String dueType;
    @JsonProperty("TaxInclusive")
    public boolean taxInclusive;
    @JsonProperty("IsPrePayment")
    public boolean isPrePayment;
    @JsonProperty("Type")
    public String type;
}
