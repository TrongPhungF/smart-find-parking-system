package authservice.org.userservice.controller;

import authservice.org.userservice.converter.UserMapper;
import authservice.org.userservice.dto.request.RequestSignUp;
import authservice.org.userservice.dto.response.AuthResponse;
import authservice.org.userservice.exception.DataNotFoundException;
import authservice.org.userservice.model.Role;
import authservice.org.userservice.model.User;
import authservice.org.userservice.security.JwtUtil;
import authservice.org.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {


    private final JwtUtil jwtUtil;

    private final UserService userService;

    //private final UserMapper userMapper;

    @PostMapping(value = "/sign-up")
    public ResponseEntity<AuthResponse> signUp(@RequestBody RequestSignUp requestSignUp) {
//        Optional<User> userOptional = userService.getById(requestSignUp.getUsername());
//        if (userOptional.isPresent()) {
//            throw new DataNotFoundException("User exist");
//        }

        User user =  userService.create(requestSignUp);
        String jwt = jwtUtil.generateJWT(user,"ACCESS");
        AuthResponse authResponse = new AuthResponse();
        authResponse.setAccessToken(jwt);
        return ResponseEntity.ok(authResponse);

    }

//    @PostMapping(value = "/sign-in")
//    public ResponseEntity<AuthResponse> signIn(@RequestBody AuthRequest authRequest) {
//        return ResponseEntity.ok(authService.register(authRequest));
//    }
}
