package com.micronaut.integration.handler;
import com.micronaut.integration.dto.response.ApiError;
import com.micronaut.integration.dto.response.BaseResponse;
import com.micronaut.integration.exceptions.InvalidRequestException;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Produces
@Singleton
@Requires(classes = { InvalidRequestException.class, ExceptionHandler.class })
public class InvalidRequestExceptionHandler implements ExceptionHandler<InvalidRequestException, HttpResponse<BaseResponse<String>>> {

    @Override
    public HttpResponse<BaseResponse<String>> handle(HttpRequest request, InvalidRequestException exception) {
        ApiError apiError = new ApiError(1001, "Invalid Request Parameter");
        return HttpResponse.badRequest(new BaseResponse<>(false, null, apiError));
    }
}
