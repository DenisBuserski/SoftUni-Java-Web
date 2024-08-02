package com.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooService {
    private final Animal animal;
    private final Animal animal1;

    public ZooService(
            @Qualifier("mySuperDog") Animal animal,
            @Qualifier("normalDog") Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }

    public void doWork() {
        animal.makeNoise();
        animal1.makeNoise();
    }

    /*
    Use without @Primary to get all Beans
    private final List<Animal> animals;

    public ZooService(List<Animal> animals) {
        this.animals = animals;
    }

    public void doWork() {
        animals.stream().forEach(animal -> animal.makeNoise());
    }
     */
}
