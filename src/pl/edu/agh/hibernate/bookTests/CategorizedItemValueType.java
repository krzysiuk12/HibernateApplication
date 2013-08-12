/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Krzysiu
 */
public class CategorizedItemValueType {
    
    private String username;
    private Date dateAdded = new Date();
    private Item item;
    private Category category;

    public CategorizedItemValueType() {
    }

    public CategorizedItemValueType(String username, Item item, Category category) {
        this.username = username;
        this.item = item;
        this.category = category;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.username);
        hash = 97 * hash + Objects.hashCode(this.dateAdded);
        hash = 97 * hash + Objects.hashCode(this.item);
        hash = 97 * hash + Objects.hashCode(this.category);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategorizedItemValueType)) {
            return false;
        }
        final CategorizedItemValueType other = (CategorizedItemValueType) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.dateAdded, other.dateAdded)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        return true;
    }
    
    
    
}
