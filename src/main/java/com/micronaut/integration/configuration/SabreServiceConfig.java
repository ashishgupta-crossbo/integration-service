package com.micronaut.integration.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Value;
import lombok.Getter;

@Getter
@ConfigurationProperties("sabre.service")
public class SabreServiceConfig {

   @Value("${sabre.service.availabilityUrl}")
    private String availabilityUrl;


}
