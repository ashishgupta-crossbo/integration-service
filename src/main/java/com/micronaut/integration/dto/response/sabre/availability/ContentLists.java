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
public class ContentLists {
    @JsonProperty("AlertList")
    public List<AlertList> alertList;
    @JsonProperty("ChargeList")
    public List<ChargeList> chargeList;
    @JsonProperty("CouponList")
    public List<CouponList> couponList;
    @JsonProperty("CurrencyList")
    public List<CurrencyList> currencyList;
    @JsonProperty("PolicyList")
    public PolicyList policyList;
    @JsonProperty("RateCategoryList")
    public List<RateCategoryList> rateCategoryList;
    @JsonProperty("RateList")
    public List<RateList> rateList;
    @JsonProperty("RoomCategoryList")
    public List<RoomCategoryList> roomCategoryList;
    @JsonProperty("RoomList")
    public List<RoomList> roomList;
    @JsonProperty("MealPlanList")
    public List<MealPlanList> mealPlanList;
}
