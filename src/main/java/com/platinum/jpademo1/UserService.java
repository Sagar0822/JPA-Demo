package com.platinum.jpademo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }
    public List<User> getUsers(){

        return userRepository.findAll();
    }

    public User getUser(int id){

        return userRepository.findById(id).get();
    }
    public User findByName(String name){
        return userRepository.findByName(name);
    }
    public List<User> findByAge(int age){
        return userRepository.findByAge(age);
    }
}
