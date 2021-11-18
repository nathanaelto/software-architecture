package io.to.domain.repositories;

import io.to.domain.entities.Member;

public interface MemberRepository {
    Member save(Member member);
}
