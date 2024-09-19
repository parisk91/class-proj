package gr.aueb.cl.ch10;

import java.util.Arrays;
import java.util.Scanner;

public class MobileContactApp {

    final static Scanner in = new Scanner(System.in); //final για προστασία σε περίπτωση που κατά λάθος αλλάξει ο δέικτης
    final static String[][] contacts = new String[500][3]; //final είναι ο δείκτης (contacts) ώστε να μην αλλάξει ο πίνακας στη  πορεία
    static int pivot = -1;

    public static void main(String[] args) {

    }

    /*
     * Controllers
     */

    public static String insertContactController(String[] contact) {
        String response = "";
        String[] errorsArray;

        if (contact == null) return "nullError";

        try {
            errorsArray = validateInsertContact(contact);
            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for ( String message : errorsArray) {
                    response += message + "\n";
                }
                return response;
            }
            insertContactService(contact);
            response = "OK"; //success
        } catch (Exception e) {
            return e.getMessage(); //exception failure
        }

        return response;
    }

    public static String[] validateInsertContact(String[] contact) {
        String[] errorsArray = new String[]{"", "", ""};

        if (contact[0].matches("\\S+") || contact[0].length() < 2) {//εντοπίζει 1 ή περισσότερους μη κενούς χαρακτήρες
            errorsArray[0] = "INVALID FIRSTNAME";
            }
        if (contact[1].matches("\\S+") || contact[1].length() < 2) {//εντοπίζει 1 ή περισσότερους μη κενούς χαρακτήρες
            errorsArray[1] = "INVALID LASTNAME";
        }
        if (contact[2].matches("\\S+") || contact[2].length() != 2) { //εντοπίζει 1 ή περισσότερους μη κενούς χαρακτήρες
            errorsArray[2] = "INVALID PHONE";
        }
        return errorsArray;
    }

    /*
     * Service Layer
     */

    public static String[] getContactByPhoneNumberService(String phoneNumber) throws Exception {//eεπειδή είναι unchecked exception
        String[] contact = null;

        try {
            contact = getByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new Exception("Contact not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //logging
            throw e;
        }
        return contact;
    }

    public static String[][] getAllContactsService() throws Exception {
        String[][] allContacts;

        try {
            allContacts = getAllContacts();
            if (allContacts.length == 0) {
                throw new Exception("List is empty");
            }
            return allContacts;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void insertContactService(String... contact) throws Exception{
        boolean isInserted = false;

        try {
            isInserted = insertContact(contact[0], contact[1], contact[2]);
            if (!isInserted) {
                throw new Exception("Phone already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void updateContactService(String... contact) throws Exception{
        boolean isUpdated = false;

        try {
            isUpdated = updateContact(contact[0], contact[1], contact[2]);
            if (!isUpdated) {
                throw new Exception("Contact does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deleteContactService(String phoneNumber) throws Exception {
        boolean isDeleted = false;

        try {
            isDeleted = deleteContact(phoneNumber);
            if (!isDeleted) {
                throw new Exception("Contact not exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }



    /*
     * CRUD Methods - CRUD Layer
     */

    /**
     *
     * @param phoneNumber
     * @return
     */

    public static int getContactIndexByPhoneNumber(String phoneNumber) { //βοηθητική μέθοδος που βρίσκει τη θέση της επαφής που ψάχνουμε και χρησιμοποιείται σε όλες τις μεθόδους CRUD
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i; //σύμβαση ότι το τηλκ είναι στη θέση 2 του πίνακα
            }
        }
        return -1;
    }

    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length - 1);
    }

    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) return false;

        if (getContactIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;

    }

    public static boolean updateContact (String firstname, String lastname, String phoneNumber) {
        int positionToUpdate = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToUpdate == -1) {
            return false;
        }

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        return true;
    }

    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }

        System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        pivot--;
        return true;
    }

    public static String[] getByPhoneNumber(String phoneNumber) {
        int position = getContactIndexByPhoneNumber(phoneNumber);
        return (position == -1) ? new String[] {} : contacts[position]; //δεν επιστρέφουμε null επειδή μπορεί να δώσει exception. Άρα επιστρέφουμε ένα κενό string με length = 0
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }
}
