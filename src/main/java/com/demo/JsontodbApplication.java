package com.demo;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.domain.Base;
import com.demo.service.BaseService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsontodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsontodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BaseService baseService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			try {
				
				TypeReference<Base> typeReference1 = new TypeReference<Base>(){};
				InputStream inputStream1 = TypeReference.class.getResourceAsStream("/json/Base.json");
				Base base = mapper.readValue(inputStream1,typeReference1);
				baseService.save(base);
				System.out.println("Base Saved!");
			} catch (IOException e){
				System.out.println("Unable to save base json: " + e.getMessage());
			}
	    };
	}
}
