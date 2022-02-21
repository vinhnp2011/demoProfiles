package com.example.demoprofiles.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



public class Cat implements Animal{
    @Override
    public String makeSound() {
        return "Meowwwwwwwwwww";
    }
}
