package authservice.org.userservice.service;





import authservice.org.userservice.dto.UserDto;
import authservice.org.userservice.dto.request.RequestSignUp;
import authservice.org.userservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(RequestSignUp requestSignUp);

    User update(User user, String id);

    Optional<User> getById(String id);

    List<User> getAll();

    void delete(String id);

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

}