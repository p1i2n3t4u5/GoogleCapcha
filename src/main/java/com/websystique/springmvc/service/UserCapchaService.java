package com.websystique.springmvc.service;

import com.websystique.springmvc.entity.UserCapcha;

public interface UserCapchaService {

	UserCapcha findById(long id);

	UserCapcha findName(String name);

	UserCapcha saveUserCapcha(UserCapcha user);

}
