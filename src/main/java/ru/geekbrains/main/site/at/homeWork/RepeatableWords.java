package ru.geekbrains.main.site.at.homeWork;

import java.util.*;

public class RepeatableWords {

    //    Создать массив с набором из 10–20 слов, должны встречаться повторяющиеся. Найти и вывести список уникальных
    //    слов, из которых состоит массив. Посчитать, сколько раз встречается каждое слово.
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Кот", "Вомбат", "Собака", "Жираф", "Слон", "Мышь", "Кот",
                "Коала", "Лев", "Тигр", "Жираф", "Вомбат", "Крыса", "Медведь", "Енот", "Бобер");
        System.out.println(words);

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        for (String word : uniqueWords) {
            System.out.printf("Слово %s встречается в коллекции %d раз(раза)\n", word, Collections.frequency(words, word));
        }
    }
}