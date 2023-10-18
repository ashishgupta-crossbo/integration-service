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
public class GuaranteePolicy {

    @JsonProperty("policy_text")
    private String policyText;

    @JsonProperty("guarantee_amount")
    private double guaranteeAmount;

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("policy_code")
    private String policyCode;
}
