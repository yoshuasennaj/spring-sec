package springsec.com.example.springsec.repository;

import org.springframework.stereotype.Repository;
import springsec.com.example.springsec.model.User;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}