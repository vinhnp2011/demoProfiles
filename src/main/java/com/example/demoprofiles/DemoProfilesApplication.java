package com.example.demoprofiles;

import com.example.demoprofiles.beans.Animal;
import com.example.demoprofiles.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoProfilesApplication implements CommandLineRunner {

    @Autowired
    private Animal animal;

    public static void main(String[] args) {
        SpringApplication.run(DemoProfilesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(animal);
        System.out.println(animal.makeSound());
    }


    @Bean
    @Profile("Cat")
    public Cat catObj()
    {
        return new Cat();
    }
}
