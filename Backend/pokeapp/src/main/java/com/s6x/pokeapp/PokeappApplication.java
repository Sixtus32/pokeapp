package com.s6x.pokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.s6x.pokeapp", "com.s6x.pokeapp.config"})
public class PokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeappApplication.class, args);
	}

}
