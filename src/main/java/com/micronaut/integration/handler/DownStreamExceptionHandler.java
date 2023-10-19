package com.micronaut.integration.handler;

import com.micronaut.integration.dto.response.ApiError;
import com.micronaut.integration.dto.response.BaseResponse;
import com.micronaut.integration.exceptions.DownStreamException;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Produces
@Singleton
@Requires(classes = { DownStreamException.class, ExceptionHandler.class })
public class DownStreamExceptionHandler implements ExceptionHandler<DownStreamException, HttpResponse<BaseResponse<String>>> {
    @Override
    public HttpResponse<BaseResponse<String>> handle(HttpRequest request, DownStreamException exception) {
        ApiError apiError = new ApiError(1001, "Getting null sabre response");
        return HttpResponse.badRequest(new BaseResponse<>(false, null, apiError));
    }
}
