package com.websystique.springmvc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.websystique.springmvc.configuration.JpaConfiguration;

public class Application {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JpaConfiguration.class)) {

		}
		System.out.println("done");
	}

}
