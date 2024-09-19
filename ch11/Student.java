package gr.aueb.cl.ch11;

/**
 * A simple definition
 * Student JavaBean
 * Data CLASS + DEFAULT CONSTRUCTOR + SETTERS/ GETTERS
 */
public class Student {
    private static int instancesCount = 0;
    private int id;
    private String firstname;
    private String lastname;

//   Static Block. Αρχικοποίηση στην αρχή ή έτσι. Μποούμε να έχουμε κώδικα στο static block Που αρχικοποιούμε
//    static {
//      in = new Scanner(System.in)
//        int num = in.nextInt(
//        instancesCount = (num == 1) ?1 : 0;
//    }

    //default Constractor
    public Student() {
//        instancesCount++;
//        id = 0;
//        firstname = null;
//        lastname = null;
    }

    //Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        instancesCount++;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    } //το κάνει αυτόματα το jvm

    //setters and getters
    public void setId(int id) {this.id = id;} //this είναι δείκτης και δείχνει στο εκάστοτε instance της κλάσης
    public int getId() {return id;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getFirstname() {return firstname;}
    public void setLastname (String lastname) {this.lastname = lastname;}
    public String getLastname () {return lastname;}
    public static int getInstancesCount() {return instancesCount;}//για να έχουμε πρόσβαση στο static πεδίο και εκτός της κλάσης
}
