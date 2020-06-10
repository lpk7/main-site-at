package ru.geekbrains.main.site.at.homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    //    Написать простой класс Телефонный Справочник, который хранит список фамилий и телефонных номеров.
//    В него с помощью метода add() можно добавлять записи, а с помощью get() — искать номер телефона по фамилии.
//    Для одной фамилии может быть несколько телефонов (однофамильцы):
//    тогда при запросе такой фамилии должны выводиться все номера.

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89213736655");
        phonebook.add("Иванов", "+79115556655");
        phonebook.add("Сидоров", "89115222334");
        phonebook.add("Петров", "89064422114");

        phonebook.get("Иванов");
        phonebook.get("Сидоров");
    }

    private Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String name, String phone) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }
        phonebook.get(name).add(phone);
    }

    public void get(String name) {
        System.out.println(name + " : " + phonebook.get(name));
    }
}
