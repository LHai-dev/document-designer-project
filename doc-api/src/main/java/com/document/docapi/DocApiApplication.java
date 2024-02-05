package com.document.docapi;

import com.document.docapi.api.SampleDataRequestDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DocApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocApiApplication.class, args);
	}

	CommandLineRunner create() {
		return (args -> {
			SampleDataRequestDto sampleDataRequestDto = new SampleDataRequestDto("kokomama", "jojo", "");
			System.out.println(sampleDataRequestDto);
		});
	}
}
