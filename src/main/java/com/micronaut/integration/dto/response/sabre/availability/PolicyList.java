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
public class PolicyList {
    @JsonProperty("BookingPolicy")
    public List<BookingPolicy> bookingPolicy;
    @JsonProperty("CancelPolicy")
    public List<CancelPolicy> cancelPolicy;
    @JsonProperty("CommisionPolicy")
    public List<CommisionPolicy> commisionPolicy;
}
