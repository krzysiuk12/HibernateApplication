/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Krzysiu
 */
public class Item {
    
    private Long id;
    //private User sellerId;
    private String name;
    private String description;
    private double initialPrice;
    private Set<Bid> bids = new HashSet<>();
    
    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Set<Bid> getBids() {
        return bids;
    }

    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }

}
