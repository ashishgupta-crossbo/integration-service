package com.micronaut.integration.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;

@ConfigurationProperties("sabre.service")
@Getter
public class SabreClientConfig {

    private SabreServiceConfig sabreService;

}
