package com.micronaut.integration.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Inject;
import lombok.Getter;

@Getter
@ConfigurationProperties("sabre.service")
public class ServiceClientConfig {

    @Inject
    private SabreServiceConfig sabreService;

    public void setSabreService(SabreServiceConfig sabreService) {
        this.sabreService = sabreService;
    }
}
