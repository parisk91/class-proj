package gr.aueb.cl.ch18.dto;


public abstract class BaseDTO {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}