package com.example.mebook.config;

import com.example.mebook.model.Users;
import com.example.mebook.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository) {
        return args -> {
            Users tony = new Users(
                    "Tony",
                    "Princeton",
                    300,
                    250

            );
            Users marquez = new Users(
                    "Marquez",
                    "Yale",
                    800,
                    430

            );
            repository.saveAll(
                    List.of(tony, marquez)
            );

        };
    }
}
