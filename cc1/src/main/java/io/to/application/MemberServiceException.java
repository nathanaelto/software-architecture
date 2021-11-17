package io.to.application;

public class MemberServiceException extends Exception{
    public MemberServiceException(String message) {
        super(message);
    }
}

class EmailValidationException extends MemberServiceException{
    public EmailValidationException() {
        super("Email format invalid");
    }
}

class PasswordValidationException extends MemberServiceException{
    public PasswordValidationException() {
        super("Password format invalid");
    }
}

class UpdatePasswordException extends MemberServiceException{
    public UpdatePasswordException() {
        super("New password is the same as the old one");
    }
}