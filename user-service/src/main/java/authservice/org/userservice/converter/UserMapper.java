package authservice.org.userservice.converter;

import authservice.org.userservice.dto.request.RequestSignUp;
import authservice.org.userservice.model.Role;
import authservice.org.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    PasswordEncoder encoder;

    public User signUpRequestToUser(RequestSignUp requestSignUp){
        User user = new User();
        user.setUserName(requestSignUp.getUsername());
        //user.setFirstName(requestSignUp.getFirstName());
        //user.setLastName(requestSignUp.getLastName());
        user.setEmail(requestSignUp.getEmail());
        //user.setPhone(requestSignUp.getPhone());
        user.setPassword(encoder.encode(requestSignUp.getPassword()));
        Role role = new Role();
        role.setRole("ROLE_CUSTOMER");
        user.setRoleName(role);
        return user;
    }
}
