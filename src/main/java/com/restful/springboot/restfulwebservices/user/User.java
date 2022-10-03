package com.restful.springboot.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private Integer id;

    @Size(min=2, message = "Name should have atleast 2 characters")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birth Date should be of a past day")
    @JsonProperty("birth_date")
    private LocalDate birthDate;
}
