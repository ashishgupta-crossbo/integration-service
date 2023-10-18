package com.micronaut.integration.configuration;

import com.micronaut.integration.common.ErrorCode;
import com.micronaut.integration.exceptions.CustomException;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import jakarta.inject.Inject;

public class WebClientConfiguration {

    @Inject
    private final HttpClient httpClient;

    public WebClientConfiguration(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public <T> HttpResponse<T> getHttpClient(String url, Class<T> responseType) {
        try {
            return httpClient.toBlocking().exchange(url, responseType);
        } catch (Exception e) {
            throw new CustomException(ErrorCode.CUSTOM_EXCEPTION);
        }
    }

}
