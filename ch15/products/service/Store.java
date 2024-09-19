package gr.aueb.cl.ch15.products.service;

import gr.aueb.cl.ch15.products.model.IProduct;
import gr.aueb.cl.ch15.products.model.Milk;

public class Store {
    //Interface as composition
    private IProduct product;

    // Depedency Injection - Inversion of Control
    public Store(IProduct product) {
        this.product = product;
    }

    public void purchase() {
        System.out.println("Milk sold");
    }
}
