package gr.aueb.cl.ch11.model;

public class ImmutablePoint3D {
    private final Point point;    // composition
    private final int z;

    public ImmutablePoint3D() {
        point = new Point();
        z  = 0;
    }

    public ImmutablePoint3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());     // deep copy, παίρνει τις τιμές από την main και δεν θέλουμε να αλλάζουμε τα στοιχεία μας
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());   // deep copy, defensive copy, αν κάποιος θέλει να πάρει ένα σημείο δημιουρεί ένα νέο και δεν πειράζει το δικό μας
    }

    public int getZ() {
        return z;
    }
}
