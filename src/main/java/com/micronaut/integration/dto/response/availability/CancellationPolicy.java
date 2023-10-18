package com.micronaut.integration.dto.response.availability;

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
@Builder
public class CancellationPolicy {
    @JsonProperty("policy_text")
    private String policyText;

    @JsonProperty("penalty_amount")
    private double penaltyAmount;

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("penalty_inclusive_tax")
    private boolean penaltyInclusiveTax;

    @JsonProperty("policy_code")
    private String policyCode;

    @JsonProperty("absolute_deadline_datetime")
    private String absoluteDeadlineDateTime;

    @JsonProperty("cancellation_allowed")
    private boolean cancellationAllowed;
}
