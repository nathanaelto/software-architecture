package io.to.infrastructure.mysql;

import io.to.domain.entities.Member;
import io.to.domain.repositories.MemberRepository;
import io.to.infrastructure.jpa.SqlMemberRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
@Profile("mysql")
public class MySqlMemberRepository implements MemberRepository {

    private final SqlMemberRepository sqlMemberRepository;

    public MySqlMemberRepository(SqlMemberRepository sqlMemberRepository) {
        this.sqlMemberRepository = sqlMemberRepository;
    }

    @Override
    public Member save(Member member) {
        return sqlMemberRepository.save(member);
    }

}
