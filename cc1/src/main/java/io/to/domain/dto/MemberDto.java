package io.to.domain.dto;

import javax.validation.constraints.NotBlank;

public class MemberDto {

    @NotBlank
    private String lastname;

    @NotBlank
    private String firstname;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private boolean isSubscriber;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscriber() {
        return isSubscriber;
    }

    public void setIsSubscriber(boolean subscriber) {
        isSubscriber = subscriber;
    }
}
