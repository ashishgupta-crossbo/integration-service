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
public class Indicators {
    @JsonProperty("AutoEnrollmentEnabled")
    public boolean autoEnrollmentEnabled;
    @JsonProperty("Commissionable")
    public boolean commissionable;
    @JsonProperty("Corporate")
    public boolean corporate;
    @JsonProperty("CredentialsRequired")
    public boolean credentialsRequired;
    @JsonProperty("Group")
    public boolean group;
    @JsonProperty("Loyalty")
    public boolean loyalty;
    @JsonProperty("LoyaltyAccrual")
    public boolean loyaltyAccrual;
    @JsonProperty("Monthly")
    public boolean monthly;
    @JsonProperty("Promotional")
    public boolean promotional;
    @JsonProperty("Redeemable")
    public boolean redeemable;
    @JsonProperty("Suppressed")
    public boolean suppressed;
    @JsonProperty("TaxInclusive")
    public boolean taxInclusive;
    @JsonProperty("VA_restricted")
    public boolean vA_restricted;
    @JsonProperty("ViewOnly")
    public boolean viewOnly;
    @JsonProperty("AllowSingleUseCard")
    public boolean allowSingleUseCard;
    @JsonProperty("PointsOnly")
    public boolean pointsOnly;
    @JsonProperty("MappedAsCorporate")
    public boolean mappedAsCorporate;
    @JsonProperty("Preferred")
    public boolean preferred;
}
