package com.example.demoprofiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dog")
public class Dog implements Animal{
    @Override
    public String makeSound() {
        return "Gauuuuuuuuuuuu";
    }
}
