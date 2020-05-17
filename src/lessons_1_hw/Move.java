package lessons_1_hw;

public interface Move {
    void info();
    boolean jump(Barrier wall);
    boolean run(Barrier treadmill);
}
