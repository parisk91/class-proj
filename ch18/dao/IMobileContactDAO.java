package gr.aueb.cl.ch18.dao;

import gr.aueb.cl.ch18.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {

    //βασικές πράξεις DAO
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(MobileContact oldMobileContact, MobileContact newMobileContact);
    void delete(Long id);
    MobileContact get(Long id);
    List<MobileContact> getAll();

    //Βοηθητικές πράξεις
    MobileContact get(String phoneNumber);
    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(Long id);
    void delete(String phoneNumber);

}
