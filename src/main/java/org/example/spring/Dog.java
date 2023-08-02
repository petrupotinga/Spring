package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
//    private String name;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow!!");
    }
}
