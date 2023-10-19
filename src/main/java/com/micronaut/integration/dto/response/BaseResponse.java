package com.micronaut.integration.dto.response;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Introspected
@Serdeable
@Builder
public class BaseResponse<T> {
    private boolean success;
    private T data;
    private ApiError error;

    public BaseResponse(boolean success, T data, ApiError error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }
    public BaseResponse(T response) {
        this.success = true;
        this.data = response;
        this.error = null;
    }
}
