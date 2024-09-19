package gr.aueb.cl.ch15;

public class Point2D extends Point {
    private double y;//'εχει πρόσβαση στοx μέσω των setters και getters που κληρονομεί


    /**
     * νέος constructor, τα δίνει αυτόματα το jvm
     */
    public Point2D() {
        super();
        y = 0.0;
    }

    /**
     * υπερφορτομένος constructor
     *
     * o super(x) καλεί τον υπερφορτωμένο constructor
     * αν ο x ήταν protecte θα μπορούσαμε να κάνουμε this.x = x
     * @param y η παράμετρος για το y
     */
    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    /**
     * overrides και προθέτει και το y
     * @return super.convertToString + αυτό πουθέλω
     */
    @Override
    public String convertToString() {
        return super.convertToString() + "(" + y + ")";
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
