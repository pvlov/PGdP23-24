package W07;


public class Penguin {

    Direction2D direction = Direction2D.UP;

    void turnLeft() {
        switch (this.direction) {
            case UP -> this.direction = Direction2D.LEFT;
            case LEFT -> this.direction = Direction2D.DOWN;
            case DOWN -> this.direction = Direction2D.RIGHT;
            case RIGHT -> this.direction = Direction2D.UP;
        }
    }

    public enum Direction2D {
        UP,
        DOWN,
        LEFT,
        RIGHT,
    }
}
