package lessons_1_hw;

public class Robot implements Move {
    private String name;
    private int distanceLength;
    private float jumpHeight;

    public Robot(String name, int distanceLength, float jumpHeight) {
        this.name = name;
        this.distanceLength = distanceLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void info() {
        System.out.println("Робот " + name + " может прыгнуть на " + jumpHeight + "м и пробежать " + distanceLength + "м");
    }

    @Override
    public boolean jump(Barrier wall) {
        if (jumpHeight >= wall.get()) {
            System.out.println("Робот " + name + " перепрыгнул стену высотой " + wall.get() + "м");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену высотой " + wall.get() + "м");
            return false;
        }
    }

    @Override
    public boolean run(Barrier treadmill) {
        if (distanceLength >= treadmill.get()) {
            System.out.println("Робот " + name + " успешно пробежал " + treadmill.get() + "м");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог пробежать " + treadmill.get() + "м");
            return false;
        }
    }
}