package com.platinum.jpademo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByName(String name); //Custom query

    List<User> findByAge(int age);  //Custom query

}
