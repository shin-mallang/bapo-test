package cart.member.presentation;

import cart.member.domain.Member;

public class SignUpRequest {

    private String email;
    private String password;

    public SignUpRequest() {
    }

    public Member toMember() {
        return new Member(null, email, password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
