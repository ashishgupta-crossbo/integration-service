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
public class ImageList {
    @JsonProperty("Caption")
    public String caption;
    @JsonProperty("Path")
    public String path;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("MediaType")
    public String mediaType;
    @JsonProperty("MediaCategory")
    public String mediaCategory;
}
