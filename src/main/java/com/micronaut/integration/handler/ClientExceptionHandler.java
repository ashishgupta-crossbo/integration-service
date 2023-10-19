package com.micronaut.integration.handler;

import com.micronaut.integration.dto.response.ApiError;
import com.micronaut.integration.dto.response.BaseResponse;
import com.micronaut.integration.exceptions.ClientException;
import com.micronaut.integration.exceptions.InternalServerException;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Produces
@Singleton
@Requires(classes = { ClientException.class, ExceptionHandler.class })
public class ClientExceptionHandler implements ExceptionHandler<ClientException, HttpResponse<BaseResponse<String>>> {
    @Override
    public HttpResponse<BaseResponse<String>> handle(HttpRequest request, ClientException exception) {
        ApiError apiError = new ApiError(1001, "Something went wrong. Please try again in sometime.");
        return HttpResponse.badRequest(new BaseResponse<>(false, null, apiError));
    }
}
