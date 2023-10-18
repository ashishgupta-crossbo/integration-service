package com.micronaut.integration.exceptions;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.handler.AbstractException;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class CustomException extends AbstractException {
    @Serial
    private static final long serialVersionUID = 1L;
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }
}
