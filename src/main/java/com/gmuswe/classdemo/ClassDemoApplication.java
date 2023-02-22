package com.gmuswe.classdemo;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClassDemoApplication {

	private static final Logger log =  LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ClassDemoApplication.class, args);
	}
}
