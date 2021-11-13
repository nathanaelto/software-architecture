package io.to.domain;

final public class Member {
    private final String lastname;
    private final String firstname;
    private final String email;
    private String password;

    private Member(String lastname, String firstname, String email, String password) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
    }

    public static Member of(String lastname, String firstname, String email, String password) {
        if (lastname.isEmpty() || firstname.isEmpty() || email.isEmpty() || password.isEmpty()){
            throw new IllegalArgumentException("Error : empty argument");
        }
        return new Member(lastname, firstname, email, password);
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
