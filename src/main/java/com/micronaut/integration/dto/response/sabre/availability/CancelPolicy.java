package com.micronaut.integration.dto.response.sabre.availability;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Introspected
@ToString

public class CancelPolicy {
    @JsonProperty("CancellationPermitted")
    public boolean cancellationPermitted;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("LateCancellationPermitted")
    public boolean lateCancellationPermitted;
    @JsonProperty("CancelFeeAmount")
    public CancelFeeAmount cancelFeeAmount;
    @JsonProperty("CancelFeeType")
    public String cancelFeeType;
    @JsonProperty("CancelPenaltyDate")
    public String cancelPenaltyDate;
    @JsonProperty("ChargeThreshold")
    public String chargeThreshold;
    @JsonProperty("ChargeType")
    public String chargeType;
    @JsonProperty("CancelTime")
    public String cancelTime;
    @JsonProperty("CancelTimeIn")
    public int cancelTimeIn;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("ModificationRestrictions")
    public String modificationRestrictions;
    @JsonProperty("NoShowFeeAmount")
    public NoShowFeeAmount noShowFeeAmount;
    @JsonProperty("NoShowFeeType")
    public String noShowFeeType;
    @JsonProperty("Charges")
    public ArrayList<Charge> charges;
}
