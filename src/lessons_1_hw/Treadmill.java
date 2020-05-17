package lessons_1_hw;

public class Treadmill implements Barrier{
    private final float distance;

    public Treadmill(float distance) {
        this.distance = distance;
    }

    @Override
    public float get() {
        return distance;
    }
}
