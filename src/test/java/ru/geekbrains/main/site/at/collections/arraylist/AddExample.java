package ru.geekbrains.main.site.at.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Пушок");
        cats.add("Васька");
        cats.add("Алиса");

        System.out.println(cats);
    }
}
