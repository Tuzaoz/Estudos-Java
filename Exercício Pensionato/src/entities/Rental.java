package entities;

public class Rental {
    public String  name;
    public String email;
    public Rental(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String toString() {
        return "name= " + name + ", email= " + email;
    }
    
}
