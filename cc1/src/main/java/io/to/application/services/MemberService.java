package io.to.application.services;

import io.to.application.exceptions.EmailValidationException;
import io.to.application.exceptions.PasswordValidationException;
import io.to.domain.dto.MemberDto;
import io.to.domain.entities.Member;
import io.to.domain.repositories.MemberRepository;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member register(MemberDto memberDto){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(memberDto.getEmail())) {
            throw new EmailValidationException();
        }
        if (memberDto.getPassword().length() < 8) {
            throw new PasswordValidationException();
        }

        Member newMember = new Member();
        newMember.setLastname(memberDto.getLastname());
        newMember.setFirstname(memberDto.getFirstname());
        newMember.setEmail(memberDto.getEmail());
        newMember.setPassword(memberDto.getPassword());
        newMember.setIsSubscriber(memberDto.isSubscriber());

        return memberRepository.save(newMember);
    }

}
