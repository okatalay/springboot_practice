package com.project.survey.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String password;

}
