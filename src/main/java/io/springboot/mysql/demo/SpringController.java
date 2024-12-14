package io.springboot.mysql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public @ResponseBody
    User createUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }

    // @GetMapping("/users")
    // public @ResponseBody
    // Iterable<User> User
    // getUser() {
    //     return userRepository.findAll();
    // }
}
