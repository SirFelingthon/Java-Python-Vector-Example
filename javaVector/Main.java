class Vector2 {
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public void normalize() {
        float magnitude = magnitude();
        if (magnitude != 0) {
            x = x / magnitude;
            y = y / magnitude;
        }
    }

    public float directionTo(Vector2 toPos) {
        return (float) Math.toDegrees(Math.atan2(toPos.y - y, toPos.x - x));
    }
}

public class Main {
    public static void main(String[] args) {
        Vector2 playerPos = new Vector2(1, 1);

        System.out.println(playerPos.magnitude());
        playerPos.normalize();
        System.out.println(playerPos.magnitude());

        Vector2 enemyPos = new Vector2(2, 2);

        System.out.println(playerPos.directionTo(enemyPos));
    }
}
