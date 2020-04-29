package com.example.banking;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.BeanDefinitionDsl;
import org.springframework.stereotype.Component;

//@Component - not allowed !!!
public class Child {
    private String name;

    public String getName() {
        return "I'm CHILD and my name is:" + name;
    }

    public Child(String aName) {
        this.name = aName;
    }
}
