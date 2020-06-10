package ru.geekbrains.main.site.at.collections.hashset;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.HashSet;
import java.util.Set;

public class ContainsExample {
    public static void main(String[] args) {
//        Set<String> cats = new HashSet<>();
//        cats.add("Пушок");
//        cats.add("Васька");
//        cats.add("Алиса");
//
//        System.out.println(cats.contains("Пушок"));

//    ----------------------------------------------------

        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog(111));
        dogs.add(new Dog(345));
        dogs.add(new Dog(123));

        System.out.println(dogs.contains(new Dog(111)));
    }
}