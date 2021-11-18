package io.to.infrastructure.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"io.to.infrastructure.jpa"})
@Configuration
public class JpaConfiguration {

    public JpaConfiguration() {
    }
}
