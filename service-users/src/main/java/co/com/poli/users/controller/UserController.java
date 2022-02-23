package co.com.poli.users.controller;

import co.com.poli.users.entities.User;
import co.com.poli.users.repositories.UserRepository;
import co.com.poli.users.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    UserService userService;
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public  List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ResponseEntity <User> save(@Valid @RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<User> delete(@PathVariable("id") long id) {
        return  userService.delete(id);
    }






}
