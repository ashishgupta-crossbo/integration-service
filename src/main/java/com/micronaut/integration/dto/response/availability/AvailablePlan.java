package com.micronaut.integration.dto.response.availability;

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
@Builder
public class AvailablePlan {
    @JsonProperty("rate_plan_code")
    private String ratePlanCode;

    @JsonProperty("total_amount_before_tax")
    private double totalAmountBeforeTax;

    @JsonProperty("total_amount_after_tax")
    private double totalAmountAfterTax;

    @JsonProperty("total_tax_amount")
    private double totalTaxAmount;

    @JsonProperty("cancellation_policy")
    private CancellationPolicy cancellationPolicy;

    @JsonProperty("guarantee_policy")
    private GuaranteePolicy guaranteePolicy;

    private List<Taxis> taxes;

    @JsonProperty("nightly_rates")
    private List<NightlyRate> nightlyRates;

    @JsonProperty("currency_code")
    private String currencyCode;

    @JsonProperty("rate_plan_name")
    private String ratePlanName;

    @JsonProperty("rate_plan_desc")
    private String ratePlanDesc;

    @JsonProperty("plan_features")
    private List<PlanFeature> planFeatures;

    @JsonProperty("breakfast_included")
    private boolean breakfastIncluded;

    @JsonProperty("lunch_included")
    private boolean lunchIncluded;

    @JsonProperty("dinner_included")
    private boolean dinnerIncluded;

    @JsonProperty("meal_plan_code")
    private String mealPlanCode;

    @JsonProperty("promo_code")
    private String promoCode;

    @JsonProperty("no_of_units_available")
    private String numberOfUnitAvailable;

    @JsonProperty("Max_Occupancy")
    private String maxOccupancy;
}
