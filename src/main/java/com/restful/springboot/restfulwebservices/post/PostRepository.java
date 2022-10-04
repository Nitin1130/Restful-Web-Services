package com.restful.springboot.restfulwebservices.post;

import com.restful.springboot.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
