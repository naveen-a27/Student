package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Naveen = new Student("Naveen","shreeki@gmail.com", LocalDate.of(2000,02,27),21);
            Student Shreeki = new Student("Shreeki","shre123eki@gmail.com", LocalDate.of(2001,03,07),20);

            repository.saveAll(List.of(Naveen,Shreeki));
        };
    }
}
