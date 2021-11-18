package io.to.exposition.controller;

import io.to.application.services.MemberService;
import io.to.domain.dto.MemberDto;
import io.to.domain.entities.Member;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/member")
public class MemberController {

    final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping()
    public Member create(@Valid @RequestBody MemberDto memberDto) {
        return memberService.register(memberDto);
    }
}
