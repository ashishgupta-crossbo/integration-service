package com.micronaut.integration.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import jakarta.inject.Inject;
import lombok.Getter;

@Getter
@ConfigurationProperties("sabre.service")
public class SabreClientConfig {

    @Inject
    private SabreServiceConfig sabreService;

    public void setSabreService(SabreServiceConfig sabreService) {
        this.sabreService = sabreService;
    }
}
