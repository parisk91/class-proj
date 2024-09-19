package gr.aueb.cl.ch11.model;

public class PointApp {

        public static void main(String[] args) {
            Point p1 = new Point(1, 2);
            Point p2 = new Point(2, 3);
            Point p3 = new Point(4, 5);
//            Point point = new Point(4,5);

            Point point = new Point();//Αρχικοποίηση με Constructor
            p1.setX(2);
            p2.setY(5);
            p3.setX(10);

            Point point1 = new Point(9,34);

            System.out.println(point.getX());
            System.out.println(point.getY());

            System.out.println(p1.pointToString());
            System.out.println(p2.pointToString());
            System.out.println(p3.pointToString());

            System.out.println(point1.pointToString());

        }
}
