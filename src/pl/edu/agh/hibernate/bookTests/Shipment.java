/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.Date;

/**
 *
 * @author Krzysiu
 */
public class Shipment {

    private long id;
    private int inscpetionPeriodDays;
    private Date created;
    private Item auction;
    
    public Shipment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInscpetionPeriodDays() {
        return inscpetionPeriodDays;
    }

    public void setInscpetionPeriodDays(int inscpetionPeriodDays) {
        this.inscpetionPeriodDays = inscpetionPeriodDays;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Item getAuction() {
        return auction;
    }

    public void setAuction(Item auction) {
        this.auction = auction;
    }
    
}
