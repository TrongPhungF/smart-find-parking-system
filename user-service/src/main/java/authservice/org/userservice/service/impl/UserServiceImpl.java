package authservice.org.userservice.service.impl;


import authservice.org.userservice.dto.request.RequestSignUp;
import authservice.org.userservice.exception.DataNotFoundException;
import authservice.org.userservice.model.InformationUser;
import authservice.org.userservice.model.Role;
import authservice.org.userservice.model.User;
import authservice.org.userservice.repositories.UserRepository;
import authservice.org.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    private final PasswordEncoder passwordEncoder;

    @Override
    public User create(RequestSignUp requestSignUp){
        User user = new User();
        user.setUserName(requestSignUp.getUsername());
        user.setPassword(passwordEncoder.encode(requestSignUp.getPassword()));
        user.setEmail(requestSignUp.getEmail());
        Role role = new Role();
        role.setRole("ROLE_CUSTOMER");
        user.setRoleName(role);
        InformationUser informationUser = new InformationUser();
        informationUser.setFirstName(requestSignUp.getFirstName());
        informationUser.setLastName(requestSignUp.getLastName());
        informationUser.setPhone(requestSignUp.getPhone());
        informationUser.setAddress(requestSignUp.getAddress());
        user.setInformationUser(informationUser);
        return userRepository.save(user);
    }

    @Override
    public User update(User user, String id) {

        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {

           // userOptional.get().setFirstName(user.getFirstName());
            //userOptional.get().setLastName(user.getLastName());
            userOptional.get().setEmail(user.getEmail());
           // userOptional.get().setPhone(user.getPhone());
           // userOptional.get().setUserName(user.getUserName());
            userOptional.get().setPassword(user.getPassword());

            return userRepository.save(userOptional.get());
        }
        throw new DataNotFoundException("User Id not found");
    }


    @Override
    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }


    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }


    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public Boolean existsByUserName(String username) {
        return null;
    }

    @Override
    public Boolean existsByEmail(String email) {
        return null;
    }
}