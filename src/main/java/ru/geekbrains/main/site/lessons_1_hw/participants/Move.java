package ru.geekbrains.main.site.lessons_1_hw.participants;

import ru.geekbrains.main.site.lessons_1_hw.оbstacles.Barrier;

public interface Move {
    void info();
    boolean jump(Barrier wall);
    boolean run(Barrier treadmill);
}
