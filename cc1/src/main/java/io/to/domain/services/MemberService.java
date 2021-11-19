package io.to.domain.services;

import io.to.domain.dto.MemberDto;
import io.to.domain.entities.Member;

public interface MemberService {
    Member register(MemberDto memberDto);
}
