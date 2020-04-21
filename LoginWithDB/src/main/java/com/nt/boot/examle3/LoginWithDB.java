package com.nt.boot.examle3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoginWithDB {

	public static void main(String[] args) {
		SpringApplication.run(LoginWithDB.class, args);
		System.out.println("hello Apps");
	}

}
