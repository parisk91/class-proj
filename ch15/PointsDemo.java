package gr.aueb.cl.ch15;

public class PointsDemo {

    private final static Point[] points;
    private static int pointsCount = 0;
    private static int point2DCount = 0;
    private static int point3DCount = 0;

    static {
        points = new Point[] {
                new Point(1), new Point2D(3, 4), new Point3D(1, 2, 3),
                new Point2D(56, 78), new Point3D(5,6,7)
        };
    }

    public static void main(String[] args) {

        for (Point point : points) {
            point.printTypeOf();

            //μετράμε από το γενικό στο ειδικό
            //instance of μετράει αν είναι του τύπου που αναζητούμε
            if (point instanceof Point3D) {
                point3DCount++;
            } else if (point instanceof Point2D) {
                point2DCount++;
            }  else {
                pointsCount++;
            }
        }

        System.out.println("Point instances: " + pointsCount);
        System.out.println("Point2D instances: " + point2DCount);
        System.out.println("Point3D instances: " + point3DCount);
    }
}
