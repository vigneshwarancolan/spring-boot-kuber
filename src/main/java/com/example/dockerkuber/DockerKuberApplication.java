package com.example.dockerkuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DockerKuberApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerKuberApplication.class, args);
	}
	
	@GetMapping(value="/get")
	public ResponseEntity<?> get(){
		return ResponseEntity.ok("get-success");
	}

}
