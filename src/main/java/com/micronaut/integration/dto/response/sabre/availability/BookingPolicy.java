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

public class BookingPolicy {

    @JsonProperty("Code")
    public String code;
    @JsonProperty("DepositFee")
    public DepositFee depositFee;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("TransactionFeeDisclaimer")
    public String transactionFeeDisclaimer;
    @JsonProperty("GuaranteeLevel")
    public String guaranteeLevel;
    @JsonProperty("RefundableStay")
    public String refundableStay;
    @JsonProperty("HoldTime")
    public String holdTime;
    @JsonProperty("AllowPay")
    public boolean allowPay;
    @JsonProperty("Requirements")
    public List<String> requirements;
    @JsonProperty("AutoCancel")
    public AutoCancel autoCancel;
}
