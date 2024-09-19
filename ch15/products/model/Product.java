package gr.aueb.cl.ch15.products.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JavaBean -> Data Class με βοηθητικές μεθόδους
 */

public class Product implements IProduct {
    //Data
    private final static ArrayList<Product> products = new ArrayList<>();//κλάση που εισάγει ευέλικτο πίνακα, θα αποθηκεύουμε δεδομένα/states

    //private final static ArrayList<IProduct> products = new ArrayList<>();//κλάση που εισάγει ευέλικτο πίνακα, θα αποθηκεύουμε δεδομένα/states
    //το κάνουμε final για να μην το κάνει new άλλος.
    //το κάνουμε static για να είναι μόνο στο επίπεδο της συγκεκριμένης κλάσης.Mutable πεδία, Immutable η λίστα

    long id; // default package private, έχουν πρόσβαση οι κλάσεις που ανήκουν στο Package
    //private για ασφάλεια των πεδίων
    private String productName;
    private String description;
    private double price;
    private int quantity;

    /*
     * 4 χαρακτηρισμοί πεδίων - access modifiers - ποιος έχει πρόσβαση
     * private, protected, public, default (package private)
     */

    //Constructor
    public Product() { //μποούμε είτε να αρχικοποιήσουμε με τιμές είτε default με 0, 0.0, null
    //        id = 0;
    //        productName = null; //"Milk";
    //        description = null;; //"My Milk";
    //        price = 0; //10;
    //        quantity = 0; //40;
        }

    public Product(long id, String productName, String description, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters & Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    //getter της λίστας για να παίρνουμε τα στοιχεία της
    public static List<Product> getProducts() {
//        return products; //=> εδώ η λίστα είναι modifiable
        return Collections.unmodifiableList(products);// δεν αλλάζει η λίστα στη main πχ με add
    }

//    public static List<IProduct> getProducts() {
////        return products; //=> εδώ η λίστα είναι modifiable
//        return Collections.unmodifiableList(products);// δεν αλλάζει η λίστα στη main πχ με add
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /*
     * Public API
     */

    @Override
    public void insert() {
        products.add(this); // add εισάγει  δεδομένα στη λίστα. Το this δείχνει στο instance του products, μπορεί να είναι πχ το product1, product 2 κτλ από την main που την καλεί
    }

}
