/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Join Table - the Category and Item Association
 * Many-To-Many
 * Strategy: Join Table with an Intermediate Entity
 * 
 * @author Krzysiu
 */
public class CategoryItemJoin {
    
    /**
     * Composite key table for Primary Key in Join Table
     */
    private static class Id implements Serializable {
        /* Composite key columns for Composite Primary Key */
        private Long categoryId;
        private Long itemId;

        public Id() {            
        }

        public Long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public Long getItemId() {
            return itemId;
        }

        public void setItemId(Long itemId) {
            this.itemId = itemId;
        }
    }
    
    /**
     * Properties: Composite Id + (Category + Item) References to Join Objects + Additional Properties
     */
    private Id id = new Id();
    private String username;
    private Date dateAdded = new Date();
    private Item item;
    private Category category;

    
    public CategoryItemJoin() {
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
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

}
