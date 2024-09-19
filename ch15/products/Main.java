package gr.aueb.cl.ch15.products;

import gr.aueb.cl.ch15.products.model.IProduct;
import gr.aueb.cl.ch15.products.model.Milk;
import gr.aueb.cl.ch15.products.model.Product;
import gr.aueb.cl.ch15.products.service.Store;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //state - δηλώσεις
        Product product2 = new Product();
        product2.setId(5);//πρόσβαση με τον τελεστή . στις τιμές του Instance

        Product product1 = new Product(1, "Honey", "My Honey", 12.8, 40);
//        System.out.println(product1.getId());//με τον getter έχουμε πρόσβαση στα δεδομένα των private πεδίων της Product
//        System.out.println(product2.getId());
        product1.setDescription("Mountain Honey");

        Store store1 = new Store(product2);

        Milk myMilk = new Milk(1, "Milk A", "Athens  Milk", 10.9, 1, "Milky");
        myMilk.insert();

        IProduct iProduct = new Product(5, "Apple", "Greek Apples", 20.8, 80);
        iProduct.insert();

        // wiring
        Store store2 = new Store(myMilk);

        /*
         * Call the service - εισαγωγή στη λίστα
         */
        product2.insert();//εισαγωγή στη λίστα
        product1.insert();

        List<Product> myProducts = Product.getProducts();
        for (Product product : myProducts) {
            System.out.println(product);
        }

//        List<IProduct> myProducts = Product.getProducts();
//        for (IProduct iproduct : myProducts) {
//            System.out.println(iproduct);
//        }
    }
}
