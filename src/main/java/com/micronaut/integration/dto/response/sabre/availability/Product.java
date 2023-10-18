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
public class Product {
    @JsonProperty("AccessCode")
    public String accessCode;
    @JsonProperty("BookingCode")
    public String bookingCode;
    @JsonProperty("CouponApplies")
    public boolean couponApplies;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("LoyaltyApplicable")
    public boolean loyaltyApplicable;
    @JsonProperty("PolicyModificationViolation")
    public boolean policyModificationViolation;
    @JsonProperty("Ref")
    public String ref;
    @JsonProperty("RefValue")
    public String refValue;
    @JsonProperty("AlertList")
    public List<AlertList> alertList;
    @JsonProperty("CommissionPolicy")
    public CommissionPolicy commissionPolicy;
    @JsonProperty("BookingPolicy")
    public BookingPolicy bookingPolicy;
    @JsonProperty("CancelPolicy")
    public CancelPolicy cancelPolicy;
    @JsonProperty("FailureList")
    public List<FailureList> failureList;
    @JsonProperty("Prices")
    public Price prices;
    @JsonProperty("Rate")
    public Rate rate;
    @JsonProperty("Room")
    public Room room;
    @JsonProperty("MealPlanList")
    public List<MealPlanList> mealPlanList;
    @JsonProperty("StayLimits")
    public StayLimits stayLimits;
    @JsonProperty("ReferenceList")
    public List<ReferenceList> referenceList;
}
