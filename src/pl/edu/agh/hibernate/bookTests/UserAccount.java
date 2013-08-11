/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

/**
 *
 * @author Krzysiu
 */
public class UserAccount {
    
    private long id;
    private String firstname;
    private String lastname;
    private Address homeAddress;
    
    public UserAccount() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    
}
