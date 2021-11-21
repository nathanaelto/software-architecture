package io.to.application.exceptions;

public class PasswordValidationException extends MemberServiceException {
    public PasswordValidationException() {
        super("Password format invalid");
    }
}
