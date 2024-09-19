package gr.aueb.cl.ch19.Sorting;

public class Product implements Comparable<Product>  {
    private String description;
    private double price;
    private int quantity;

    public Product(){
    }

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int compareTo(Product other) {

        //return this.description.compareTo(other.description);

//        if (this.quantity > other.quantity)
//            return 1;
//        else if (this.quantity < other.quantity)
//            return -1;
//        else return 0;

        // return this.quantity - other.quantity;
        return Double.compare(this.price, other.price);
    }


}
