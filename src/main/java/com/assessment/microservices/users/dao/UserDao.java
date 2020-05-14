package com.assessment.microservices.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.microservices.users.entities.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
