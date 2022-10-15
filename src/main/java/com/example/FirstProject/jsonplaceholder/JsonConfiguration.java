package com.example.FirstProject.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfiguration
{

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JsonePlaceHolderClient jsonPlaceHolderClient){
        return args->{
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println(jsonPlaceHolderClient.getPost(1));
        };
    }
}
