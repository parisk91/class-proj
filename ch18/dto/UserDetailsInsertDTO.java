package gr.aueb.cl.ch18.dto;

public class UserDetailsInsertDTO extends BaseDTO {
    private String firstname;
    private String lastname;

    public UserDetailsInsertDTO() {
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public UserDetailsInsertDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
