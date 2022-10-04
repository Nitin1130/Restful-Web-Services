package com.restful.springboot.restfulwebservices.jpa;

import com.restful.springboot.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
