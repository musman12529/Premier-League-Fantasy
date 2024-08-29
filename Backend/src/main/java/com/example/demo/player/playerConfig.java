package com.example.demo.player;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;


@Configuration
public class playerConfig {

    @Bean
    CommandLineRunner commandLineRunner(playerRepository Repository) {
        return args -> {
             
			new player(1L, "Kevin De Bruyne", "Belgium", "MF", 29, 25, 23, 2047.0, 6.0, 12.0, 0.0, 2.0, 0.0, 0.0, 0.0, "Manchester City");
		
        };

    }

}
