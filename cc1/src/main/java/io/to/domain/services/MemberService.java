package io.to.domain.services;

import io.to.domain.dto.MemberDto;
import io.to.domain.entities.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    Member register(MemberDto memberDto);
}
