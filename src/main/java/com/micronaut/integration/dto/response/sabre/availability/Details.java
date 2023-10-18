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

public class Details {
    @JsonProperty("AttachToReservation")
    public boolean attachToReservation;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("DetailedDescription")
    public String detailedDescription;
    @JsonProperty("Validity")
    public Validity validity;
    @JsonProperty("Visibility")
    public Visibility visibility;
    @JsonProperty("Frequency")
    public String frequency;
    @JsonProperty("ChargePer")
    public String chargePer;
    @JsonProperty("TaxAmount")
    public int taxAmount;
    @JsonProperty("FactorType")
    public String factorType;
    @JsonProperty("IsInclusive")
    public boolean isInclusive;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("BookingMethod")
    public String bookingMethod;
    @JsonProperty("CommissionablePercentage")
    public int commissionablePercentage;
    @JsonProperty("CountryList")
    public List<CountryList> countryList;
    @JsonProperty("CustLoyaltyList")
    public List<CustLoyaltyList> custLoyaltyList;
    @JsonProperty("DisplayName")
    public String displayName;
    @JsonProperty("DisplayDescription")
    public String displayDescription;
    @JsonProperty("ImageList")
    public List<ImageList> imageList;
    @JsonProperty("Indicators")
    public Indicators indicators;
    @JsonProperty("LoyaltyRedemptionType")
    public String loyaltyRedemptionType;
    @JsonProperty("RateClass")
    public String rateClass;
    @JsonProperty("ChannelAccessOverridesList")
    public List<ChannelAccessOverridesList> channelAccessOverridesList;
    @JsonProperty("SpecialInstructions")
    public String specialInstructions;
    @JsonProperty("MealPlan")
    public MealPlan mealPlan;
    @JsonProperty("AdaComplaint")
    public boolean adaComplaint;
    @JsonProperty("Bedding")
    public List<Bedding> bedding;
    @JsonProperty("ChildOccupancy")
    public List<ChildOccupancy> childOccupancy;

    @JsonProperty("Class")
    public Class classes;
    @JsonProperty("ExtraBed")
    public ExtraBed extraBed;
    @JsonProperty("FeatureList")
    public List<FeatureList> featureList;
    @JsonProperty("GuestLimit")
    public GuestLimit guestLimit;
    @JsonProperty("Size")
    public Size size;
    @JsonProperty("ViewList")
    public List<ViewList> viewList;
}
