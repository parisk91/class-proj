package gr.aueb.cl.ch14;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Singleton - Static Factory method, καλεί τον constructor
     *
     * @return a {@link Point} instance
     */
    public static Point gteInstance() {
        return new Point();
    }


    /**
     * Καλεί τον υπερφορτωμένο constructor και δίνει τυχαία νούμερα
     * @return
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101));
    }
}
