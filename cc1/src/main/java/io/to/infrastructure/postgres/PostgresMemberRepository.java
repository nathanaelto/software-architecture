package io.to.infrastructure.postgres;

import io.to.domain.entities.Member;
import io.to.domain.repositories.MemberRepository;
import io.to.infrastructure.jpa.SqlMemberRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("postgres")
public class PostgresMemberRepository implements MemberRepository {

    private final SqlMemberRepository sqlMemberRepository;

    public PostgresMemberRepository(SqlMemberRepository memberRepository) {
        this.sqlMemberRepository = memberRepository;
    }

    @Override
    public Member save(Member member) {
        return sqlMemberRepository.save(member);
    }

}
