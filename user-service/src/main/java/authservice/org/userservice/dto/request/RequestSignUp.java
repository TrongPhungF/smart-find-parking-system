package authservice.org.userservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestSignUp {

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String username;

    private String password;

    private String confirmPassword;

    private String address;
}
