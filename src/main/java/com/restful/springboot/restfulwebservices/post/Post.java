package com.restful.springboot.restfulwebservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restful.springboot.restfulwebservices.user.User;
import jakarta.persistence.*;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    @Size(min = 10)
    private String description;

}
