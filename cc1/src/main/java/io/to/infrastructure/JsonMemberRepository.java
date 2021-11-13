package io.to.infrastructure;

import io.to.domain.Member;
import io.to.domain.MemberRepository;

public class JsonMemberRepository implements MemberRepository {
    @Override
    public void save(Member member) {
        System.out.println(String.format("{} add in json", member.toString()));
    }

    @Override
    public void updatePassword(Member member) {
        System.out.println(String.format("Password update for {} {}", member.getLastname(), member.getFirstname()));
    }
}
