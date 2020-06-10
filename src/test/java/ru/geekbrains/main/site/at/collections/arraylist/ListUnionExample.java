package ru.geekbrains.main.site.at.collections.arraylist;

import org.apache.commons.collections.ListUtils;
import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.ArrayList;
import java.util.List;

public class ListUnionExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(111));
        dogs.add(new Dog(345));

        List<Dog> dogs2 = new ArrayList<>();
        dogs2.add(new Dog(123));
        dogs2.add(new Dog(678));
        dogs2.add(new Dog(345));

        System.out.println(dogs);
        System.out.println(dogs2);

        List<String> allDogs = ListUtils.union(dogs, dogs2);
        System.out.println(allDogs);
    }
}
