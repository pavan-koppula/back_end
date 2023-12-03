package com.pavan;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MvcPageSprinBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcPageSprinBootApplication.class, args);
	}

}
