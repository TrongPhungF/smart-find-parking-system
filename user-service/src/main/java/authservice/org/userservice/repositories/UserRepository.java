package authservice.org.userservice.repositories;

import authservice.org.userservice.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@EnableScan
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

}
