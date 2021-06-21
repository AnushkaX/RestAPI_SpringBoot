package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student chamaka = new Student(
                  "Athukotala",
                  "CM",
                  'm',
                  "USA",
                  "123455"

          );

            Student issa = new Student(
                    "Athukotala",
                    "CM",
                    'm',
                    "USA",
                    "123455"

            );

            repository.saveAll(
                    List.of(chamaka, issa)
            );
        };
    }
}
