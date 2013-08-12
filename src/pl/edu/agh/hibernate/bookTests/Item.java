/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
    private double reservePrice;
    private Date startDate;
    private Date endDate;
    private Date approvalDatetime;
    //private Set<Bid> bids = new HashSet<>();
    //private Collection<Bid> bids = new ArrayList<>();
    private List<Bid> bids = new ArrayList<>();
    private UserAccount buyerId;
    private Set<Category> categories = new HashSet<>();
    private Set<CategoryItemJoin> categoryItemJoin = new HashSet<>();
    
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

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public double getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getApprovalDatetime() {
        return approvalDatetime;
    }

    public void setApprovalDatetime(Date approvalDatetime) {
        this.approvalDatetime = approvalDatetime;
    }

    public UserAccount getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(UserAccount buyerId) {
        this.buyerId = buyerId;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<CategoryItemJoin> getCategoryItemJoin() {
        return categoryItemJoin;
    }

    public void setCategoryItemJoin(Set<CategoryItemJoin> categoryItemJoin) {
        this.categoryItemJoin = categoryItemJoin;
    }
    
}
