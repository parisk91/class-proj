package gr.aueb.cl.ch11;

/**
 * Driver class
 * Creates an instance/ object of Student class
 */
public class Main {

    public static void main(String[] args) {
        Student alice = new Student(); //με το new καλούμε τον constructor, αρχικοποιεί τα πεδία(state της alice)
        Student bob = new Student();
        Student chris = new Student();
        Student mark = new Student(4, "Mark", "S");

        mark.setId(5);

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");



        System.out.println("Instances Count: " + Student.getInstancesCount());//καλε΄ιται με το όνομα της κλάης μπροστά.
    }
}
