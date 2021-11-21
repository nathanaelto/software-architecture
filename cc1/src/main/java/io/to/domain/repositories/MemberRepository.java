package io.to.domain.repositories;

import io.to.domain.entities.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    Member save(Member member);
}
