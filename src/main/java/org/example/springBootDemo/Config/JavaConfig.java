package org.example.springBootDemo.Config;

import org.example.springBootDemo.DevProfile;
import org.example.springBootDemo.ProductionProfile;
import org.example.springBootDemo.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(name = "devProfile")
    @ConditionalOnProperty(value = "example.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name = "productionProfile")
    @ConditionalOnProperty(value = "example.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
