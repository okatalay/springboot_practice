package com.project.survey.model;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name = "users")
@Getter
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String password;


}
