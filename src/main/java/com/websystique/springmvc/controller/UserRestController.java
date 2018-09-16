package com.websystique.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.websystique.springmvc.entity.UserCapcha;
import com.websystique.springmvc.service.UserCapchaService;

@RestController
public class UserRestController {

	@Autowired
	UserCapchaService userCapchaService;

	@RequestMapping(value = "/user/postform", method = RequestMethod.POST)
	public ResponseEntity<Void> postform(HttpServletRequest request,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "phone", required = false) String phone,
			@RequestParam(value = "firstName", required = false) String firstName,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "g-recaptcha-response", required = false) String capcha, UriComponentsBuilder ucBuilder) {
		UserCapcha userCapcha = new UserCapcha();

		userCapcha.setCapcha(capcha);
		userCapcha.setEmail(email);
		userCapcha.setPhone(phone);
		userCapcha.setFirstName(firstName);
		userCapcha.setLastName(lastName);

		userCapchaService.saveUserCapcha(userCapcha);

		HttpHeaders headers = new HttpHeaders();
		/*headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(userCapcha).toUri());*/
		headers.setLocation(ucBuilder.buildAndExpand().toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.PERMANENT_REDIRECT);

	}

}