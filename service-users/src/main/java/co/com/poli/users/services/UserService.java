package co.com.poli.users.services;

import co.com.poli.users.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    ResponseEntity<User> save(User user);
    void deleteById(Long id);
    List<User> findAll();
    ResponseEntity<User> delete(Long id);

}
