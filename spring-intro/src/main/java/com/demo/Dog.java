package com.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;

public class Dog implements Animal, BeanNameAware {
    private boolean superDog;

    public Dog() {
        this(false);
    }

    public Dog(boolean superDog) {
        this.superDog = superDog;
    }

    @Override
    public void makeNoise() {
        if (superDog) {
            System.out.println("I am super");
        } else {
            System.out.println("I am normal");
        }
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("DOG IS READY");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("The name is " + name);
    }
}
