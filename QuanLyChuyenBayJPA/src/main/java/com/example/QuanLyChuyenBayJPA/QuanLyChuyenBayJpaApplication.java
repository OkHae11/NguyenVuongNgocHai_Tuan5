package com.example.QuanLyChuyenBayJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class QuanLyChuyenBayJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyChuyenBayJpaApplication.class, args);
		System.out.println();
	}

}
