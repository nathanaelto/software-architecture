package io.to.domain.repositories;

import io.to.domain.entities.Member;

public interface MemberRepository {
    void save(Member member);

    void updatePassword(Member member);
}
