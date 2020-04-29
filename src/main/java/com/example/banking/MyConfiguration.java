package com.example.banking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//This is called Java configuration for Spring.
//This method is evolution of XML based configuration.
//@Configuration and @Bean entries map directly to the old XML
//layout.

@Configuration  //you can call it "mother of the beans"
public class MyConfiguration {

    @Bean  //whatever is returned - will be managed by Spring container
    public List<Child> children() {
        List<Child> result = new ArrayList<>();
        result.add(new Child("jozek"));
        result.add(new Child("marian"));
        result.add(new Child("marysia"));
        return result;
    }

    @Bean
    public MoreData moreData() {
        return new MoreData("much more data!");
    }
}
