package io.to.application;


import io.to.domain.entities.Member;
import io.to.domain.repositories.MemberRepository;

import org.apache.commons.validator.routines.EmailValidator;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    void register(Member member) throws EmailValidationException, PasswordValidationException {
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(member.getEmail())){
            throw new EmailValidationException();
        }
        if (member.getPassword().length() < 8){
            throw new PasswordValidationException();
        }

        memberRepository.save(member);
    }

    void updatePassword(Member member, String newPassword) throws UpdatePasswordException, PasswordValidationException {
        if (member.getPassword().equals(newPassword)){
            throw new UpdatePasswordException();
        }
        if (newPassword.length() < 8){
            throw new PasswordValidationException();
        }
        member.changePassword(newPassword);
        memberRepository.updatePassword(member);
    }
}
