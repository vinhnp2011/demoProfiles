package com.example.demoprofiles;

import com.example.demoprofiles.beans.MyDatasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyDatasource myDatasource()
    {
        MyDatasource myDatasource  = new MyDatasource();

        System.out.println("print>>>>"+ myDatasource.getUser() + " " + myDatasource.getPassword());

        return myDatasource;
    }
}
