package ru.geekbrains.main.site.lessons_1_hw.оbstacles;

public class Wall implements Barrier {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public float get() {
        return height;
    }
}
