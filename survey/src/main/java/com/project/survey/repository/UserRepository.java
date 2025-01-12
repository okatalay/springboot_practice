package com.project.survey.repository;


import com.project.survey.model.User;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UserRepository extends JpaRepository<User, Long> {



}
