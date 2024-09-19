package gr.aueb.cl.ch19.cfcollections;

import java.util.List;
import java.awt.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Paris", "London");//unmodifiable list
        Iterator<String> itr = cities.iterator();//δείκτης που δείχνεο τα στοιχεία της λίστας

        //όχι σύντομος τρόπος
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        cities.removeIf(c -> c.equals("London"));//ελέγχει για κάθε c της λίστας

        //βασικός μηχανισμός διάσχισης
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("London")) cities.remove(s); //itr.remove
            System.out.println(s);
        }

        //enhached for is based in iteration
        for (String s : cities) {
            System.out.println(s);
        }

        //forEach is a method - καλύτερη μέθοδος διάσχισης
        cities.forEach(System.out::print);
    }
}
