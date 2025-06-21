package br.com.ebac.meme_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MemeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemeServiceApplication.class, args);
	}

}
