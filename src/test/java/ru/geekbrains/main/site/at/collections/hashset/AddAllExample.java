package ru.geekbrains.main.site.at.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class AddAllExample {
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        cats.add("Пушок");
        cats.add("Васька");
        cats.add("Алиса");
        System.out.println(cats);

        Set<String> cats2 = new HashSet<>();
        cats2.add("Пушок");
        cats2.add("Семен");
        cats2.add("Снежок");
        System.out.println(cats2);

        cats.addAll(cats2);
        System.out.println(cats);
    }
}
