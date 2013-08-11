package pl.edu.agh.hibernate.bookTests;

/**
 * Entity Class - represents a address data for the User
 * 
 * @author Krzysiu
 */
public class Address {
   
    private long id;
    private String street;
    private String zipcode;
    private String city;
    private UserAccount user;
    
    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
  
}
