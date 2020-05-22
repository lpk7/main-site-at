package ru.geekbrains.main.site.lessons_1_hw;

import ru.geekbrains.main.site.lessons_1_hw.participants.Cat;
import ru.geekbrains.main.site.lessons_1_hw.participants.Human;
import ru.geekbrains.main.site.lessons_1_hw.participants.Move;
import ru.geekbrains.main.site.lessons_1_hw.participants.Robot;
import ru.geekbrains.main.site.lessons_1_hw.оbstacles.Barrier;
import ru.geekbrains.main.site.lessons_1_hw.оbstacles.Treadmill;
import ru.geekbrains.main.site.lessons_1_hw.оbstacles.Wall;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat("Василий", 800, 2);
        Human man = new Human("Александр", 10000, 1.2f);
        Robot robot = new Robot("C-3PO", 3000, 0.6f);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(0.5f);
        Treadmill treadmill1 = new Treadmill(3000);
        Treadmill treadmill2 = new Treadmill(400);

        Move[] moves = {cat, man, robot};
        Barrier[] barriers = {treadmill1, wall1, treadmill2, wall2};

        for (Move move : moves) {
            move.info();
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof Wall) {
                    if (!move.jump(barriers[j])) {
                        System.out.println("Участник выбыл из испытания.");
                        break;
                    }
                } else {
                    if (!move.run(barriers[j])) {
                        System.out.println("Участник выбыл из испытания.");
                        break;
                    }
                }
                if (j == barriers.length - 1) {
                    System.out.println("Участник прошел все препятствия!");
                }
            }
        }
    }
}
