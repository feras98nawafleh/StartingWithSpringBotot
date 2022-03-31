package com.example.StartingWithSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Feras = new Student("Feras Nawafleh", "fero.nofal@gmail.com", 24, LocalDate.of(1998, 7, 4));
            Student Tarek = new Student("Tarek Nawafleh", "Tarek.nofal@gmail.com", 24, LocalDate.of(1992, 7, 4));
            Student Mohammad = new Student("Mohammad Nawafleh", "Mohammad.nofal@gmail.com", 24, LocalDate.of(1994, 7, 4));
            Student Yazeed = new Student("Yazeed Nawafleh", "Yazeed.nofal@gmail.com", 24, LocalDate.of(2002, 7, 4));

            studentRepository.saveAll(
                    List.of(Feras, Tarek, Mohammad, Yazeed)
            );
        };
    }
}
