package io.to.infrastructure.configuration;

import io.to.infrastructure.repository.SqlMemberRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = SqlMemberRepository.class)
public class MysqlConfiguration {
}
