package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor
@Document(collection = "users")
public class User{

    @Field(value = "name")
    private String name;

    @Field(value = "age")
    private Integer age;

    @Field(value = "department")
    private String department;
    
}