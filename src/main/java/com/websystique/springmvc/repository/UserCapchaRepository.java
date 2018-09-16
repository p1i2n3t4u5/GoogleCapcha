package com.websystique.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.entity.UserCapcha;

@Repository
public interface UserCapchaRepository extends JpaRepository<UserCapcha, Long> {

}
