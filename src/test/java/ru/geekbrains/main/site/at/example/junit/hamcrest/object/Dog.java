package ru.geekbrains.main.site.at.example.junit.hamcrest.object;

public class Dog extends Animal {

    public Dog(String sound) {
        super(sound);
    }

    @Override
    public String toString() {
        return this.sound;
    }
}
