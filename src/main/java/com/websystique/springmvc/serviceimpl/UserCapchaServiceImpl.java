package com.websystique.springmvc.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.entity.UserCapcha;
import com.websystique.springmvc.helper.VerifyRecaptcha;
import com.websystique.springmvc.repository.UserCapchaRepository;
import com.websystique.springmvc.service.UserCapchaService;

@Service("userCapchaService")
@Transactional
public class UserCapchaServiceImpl implements UserCapchaService {
	@Autowired
	UserCapchaRepository capchaRepository;

	@Override
	public UserCapcha findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCapcha findName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCapcha saveUserCapcha(UserCapcha userCapcha) {
		boolean verify = false;
		try {
			verify = VerifyRecaptcha.verify(userCapcha.getCapcha());
		} catch (IOException e) {
			e.printStackTrace();
		}
		userCapcha.setVerified(verify);
		System.out.println("capcha:"+ userCapcha);
		return capchaRepository.save(userCapcha);
	}

}
