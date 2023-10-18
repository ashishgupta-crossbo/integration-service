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
public class Price {
    @JsonProperty("ArrivalDate")
    public String arrivalDate;
    @JsonProperty("AMOUNT")
    public int amount;
    @JsonProperty("DepartureDate")
    public String departureDate;
    @JsonProperty("Available")
    public boolean available;
    @JsonProperty("AvailableInventory")
    public int availableInventory;
    @JsonProperty("CouponApplies")
    public boolean couponApplies;
    @JsonProperty("IsMaximumPricedItem")
    public boolean isMaximumPricedItem;
    @JsonProperty("IsMinimumPricedItem")
    public boolean isMinimumPricedItem;
    @JsonProperty("SortSequenceNumber")
    public int sortSequenceNumber;
    @JsonProperty("Product")
    public Product product;
    @JsonProperty("TaxesFeesIncluded")
    public boolean taxesFeesIncluded;
    @JsonProperty("Daily")
    public List<Daily> daily;
    @JsonProperty("Monthly")
    public List<Monthly> monthly;
    @JsonProperty("PerNight")
    public PerNight perNight;
    @JsonProperty("Total")
    public Total total;
    @JsonProperty("Tax")
    public Tax tax;
    @JsonProperty("Fees")
    public Fees fees;
}
