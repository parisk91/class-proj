package gr.aueb.cl.ch19;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode1 = new FlexibleNode();
        flexibleNode1.setItem("Hello");//κάνουμε set string

        FlexibleNode flexibleNode2 = new FlexibleNode();
        flexibleNode2.setItem(2);//κάνουμε set ένα int - AutoBox

        int myInt = (int) flexibleNode1.getItem();//το δηλώνουμε ως int, ClassCastException, @runtime

        System.out.println(myInt);
    }
}