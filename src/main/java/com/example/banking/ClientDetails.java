package com.example.banking;


import org.springframework.stereotype.Component;

@Component
public class ClientDetails {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name = "Amit";
    private Integer age = 23;

}
