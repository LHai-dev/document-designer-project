package com.document.docapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DocApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocApiApplication.class, args);
	}

}
