package ru.geekbrains.main.site.lessons_1_hw.оbstacles;

public class Treadmill implements Barrier {
    private final float distance;

    public Treadmill(float distance) {
        this.distance = distance;
    }

    @Override
    public float get() {
        return distance;
    }
}
