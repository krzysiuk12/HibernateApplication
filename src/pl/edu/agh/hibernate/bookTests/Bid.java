/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

/**
 *
 * @author Krzysiu
 */
public class Bid {
    
    private Long id;
    private Item item;
    //private User bidderId;
    private double amount;
    
    public Bid() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
