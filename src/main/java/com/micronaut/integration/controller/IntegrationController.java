package com.micronaut.integration.controller;
import com.micronaut.integration.dto.response.BaseResponse;
import com.micronaut.integration.dto.response.availability.AvailabilityRoomResponse;
import com.micronaut.integration.service.IntegrationService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

@Controller("/integration")
@ExecuteOn(TaskExecutors.IO)
public class IntegrationController {

    @Inject
    private final IntegrationService integrationService;

    public IntegrationController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    @Get("/roomAvailability")
    public HttpResponse<BaseResponse<AvailabilityRoomResponse>> roomAvailability(@QueryValue int adults, @QueryValue long chainId,
                                                                                      @QueryValue String primaryChannel, @QueryValue String secondaryChannel,
                                                                                      @QueryValue int hotelId, @QueryValue int numRooms,
                                                                                      @QueryValue String startDate, @QueryValue String endDate) {
        AvailabilityRoomResponse response = integrationService.roomAvailability(adults,chainId,primaryChannel,secondaryChannel,hotelId,numRooms,startDate,endDate);
        return HttpResponse.ok(new BaseResponse<>(response));
    }

}
