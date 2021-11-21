package io.to.application.exceptions;

public class EmailValidationException extends MemberServiceException {
    public EmailValidationException() {
        super("Email format invalid");
    }
}
