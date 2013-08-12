/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Krzysiu
 */
public class Category {
   
    private Long id;
    private Set<Item> items = new HashSet<>();
    private Set<CategoryItemJoin> categoryItemJoin = new HashSet<>();
    private Set<CategorizedItemValueType> categorizedItemValueTypes = new HashSet<>();
    private Map<UserAccount, Item> ternaryAssociation = new HashMap<>();
    
    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<CategoryItemJoin> getCategoryItemJoin() {
        return categoryItemJoin;
    }

    public void setCategoryItemJoin(Set<CategoryItemJoin> categoryItemJoin) {
        this.categoryItemJoin = categoryItemJoin;
    }

    public Set<CategorizedItemValueType> getCategorizedItemValueTypes() {
        return categorizedItemValueTypes;
    }

    public void setCategorizedItemValueTypes(Set<CategorizedItemValueType> categorizedItemValueTypes) {
        this.categorizedItemValueTypes = categorizedItemValueTypes;
    }

    public Map<UserAccount, Item> getTernaryAssociation() {
        return ternaryAssociation;
    }

    public void setTernaryAssociation(Map<UserAccount, Item> ternaryAssociation) {
        this.ternaryAssociation = ternaryAssociation;
    }
    
}
