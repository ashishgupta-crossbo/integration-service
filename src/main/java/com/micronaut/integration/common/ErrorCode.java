package com.micronaut.integration.common;

import lombok.Getter;

@Getter
public enum ErrorCode {

    INTERNAL_SERVER_ERROR(120, "Internal Server Error"),
    INTERNAL_SERVER_EXCEPTION(120,"Something went wrong. Please try again in sometime."),
    INVALID_REQUEST(120,"Invalid Request"),
    INVALID_SERVICE_PROVIDER_EXCEPTION(120,"Invalid Service Provider Exception"),
    DOWNSTREAM_EXCEPTION(120,"Invalid sabre response"),
    CLIENT_EXCEPTION(120,"Getting invalid statusCode in response");

    private int value;
    private String message;

    ErrorCode(int i, String s) {
        this.value=i;
        this.message=s;
    }
}
