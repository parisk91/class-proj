package gr.aueb.cl.ch11.model;

public final class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String pointToString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

//    public static class Point {
//        private int x;
//        private int y;
//
//
//
//        public Point(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
}
