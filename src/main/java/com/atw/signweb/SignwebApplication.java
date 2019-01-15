package com.atw.signweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.atw.signweb.repository.dao")
@SpringBootApplication
public class SignwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignwebApplication.class, args);
	}

}

