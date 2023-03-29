package com.platinum.jpademo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
       return userService.addUser(user);
    }

    @GetMapping("/get_users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
    @GetMapping("/get_by_name")
    public User findByName(@RequestParam("name") String name){
        return userService.findByName(name);
    }

    @GetMapping("/get_by_age")
    public List<User> findByAge(@RequestParam("age") int age){
        return userService.findByAge(age);
    }

}
