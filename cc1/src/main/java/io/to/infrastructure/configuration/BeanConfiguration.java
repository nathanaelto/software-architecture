package io.to.infrastructure.configuration;

import io.to.application.services.MemberServiceImplem;
import io.to.domain.repositories.MemberRepository;
import io.to.domain.services.MemberService;
import io.to.exposition.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Server.class)
public class BeanConfiguration {
    @Bean
    MemberService memberService(final MemberRepository memberRepository) {
        return new MemberServiceImplem(memberRepository);
    }
}
