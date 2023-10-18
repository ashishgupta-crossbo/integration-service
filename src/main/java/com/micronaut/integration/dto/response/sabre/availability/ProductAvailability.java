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
public class ProductAvailability {
    @JsonProperty("AlertList")
    public List<AlertList> alertList;
    @JsonProperty("CouponList")
    public List<CouponList> couponList;
    @JsonProperty("Hotel")
    public Hotel hotel;
    @JsonProperty("LeastRestrictiveFailure")
    public LeastRestrictiveFailure leastRestrictiveFailure;
    @JsonProperty("Paging")
    public Paging paging;
    @JsonProperty("Prices")
    public List<Price> prices;
    @JsonProperty("AdditionalPrices")
    public List<AdditionalPrice> additionalPrices;
    @JsonProperty("ProductResult")
    public String productResult;
}
