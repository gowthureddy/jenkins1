package com.sonarcubedemo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonarcubedemo2.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
