package io.to.domain;

import io.to.domain.Member;

public interface MemberRepository {
    void save(Member member);

    void updatePassword(Member member);
}
