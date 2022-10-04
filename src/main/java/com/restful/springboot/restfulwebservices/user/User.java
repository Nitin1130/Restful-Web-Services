package com.restful.springboot.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.restful.springboot.restfulwebservices.post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_details")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name should have atleast 2 characters")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birth Date should be of a past day")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    public User(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
