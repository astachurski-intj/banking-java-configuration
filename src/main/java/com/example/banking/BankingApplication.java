package com.example.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BankingApplication.class, args);
        AccountOwner accountOwner = context.getBean(AccountOwner.class);
        String money = null;
        try {
            money = accountOwner.getMoney();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(money);
    }
}
