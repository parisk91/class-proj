package gr.aueb.cl.ch15.products.model;

public class Milk extends Product {
    private String manufacturer;

    public Milk(){ //δίνεται αυτόματα έτσι κι αλλιώς ακόμα και αν δεν τον δηλώσουμε
        super();//δείκτης που δείχνει τον constructor της από πάνω κλάσης
        manufacturer = null; //επιπλέον πεδία από αυτά της Product
    }

    public Milk(long id, String productName, String description, double price, int quantity, String manufacturer) {
        super(id, productName, description, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + "Milk{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override //κληρονομεί την insert από την Product. Την κάνω override ώστε να προσθέσω κάτι επιπλέον , εδώ το sout
    public void insert() {
        super.insert();
        System.out.println("Successful insert");
    }
}
