package io.to.infrastructure.repository.mysql;

import io.to.domain.entities.Member;
import io.to.domain.repositories.MemberRepository;
import io.to.infrastructure.repository.SqlMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySqlMemberRepository implements MemberRepository {

    private final SqlMemberRepository memberRepository;

    @Autowired
    public MySqlMemberRepository(SqlMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

}
