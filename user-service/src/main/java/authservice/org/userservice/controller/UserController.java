package authservice.org.userservice.controller;


import authservice.org.userservice.converter.UserMapper;
import authservice.org.userservice.dto.request.RequestSignIn;
import authservice.org.userservice.dto.request.RequestSignUp;
import authservice.org.userservice.exception.DataNotFoundException;
import authservice.org.userservice.model.Role;
import authservice.org.userservice.model.User;
import authservice.org.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Log4j2
public class UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping()
    public List<User> all() {
        return userService.getAll();
    }

    @PostMapping("/sign-in")
    public ResponseEntity<?> login(@RequestBody RequestSignIn requestSignIn) {

//        log.info("UserController | login is started");
//
//        AccessTokenResponse accessTokenResponse = keycloakService.loginWithKeycloak(requestSignIn);
//        if (accessTokenResponse == null) {
//            log.info("UserController | login | Http Status Bad Request");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(accessTokenResponse);
//        }
//
//        log.info("UserController | login | Http Status Ok");
//
//        return ResponseEntity.ok(accessTokenResponse);
        return null;
    }

//    @PutMapping(value = "/{userName}")
//    public User update(@PathVariable("userName") String userName, @RequestBody User user) {
//        return userService.update(user, userName);
//    }
//
//    @GetMapping("/{userName}")
//    public User getUserById(@PathVariable(value = "userName") String userName) {
//        return userService.getById(userName).orElseThrow(() -> new DataNotFoundException("not found"));
//    }
//
//    @DeleteMapping("/{userName}")
//    public void deleteUser(@PathVariable(value = "userName") String userName) {
//        userService.delete(userName);
//    }

}
