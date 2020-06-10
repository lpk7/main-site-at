package ru.geekbrains.main.site.at.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {
    public static void main(String[] args) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Бобик");
        dogs.add("Шарик");
        dogs.add("Барбос");
        dogs.add("Мухтар");

        System.out.println(dogs);
        Collections.sort(dogs);
        //System.out.println(Collections.sort(dogs));
        System.out.println(dogs);
    }
}
