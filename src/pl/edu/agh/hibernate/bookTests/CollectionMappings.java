/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Krzysiu
 */
public class CollectionMappings {
    
    private long id;
    private Set<String> stringSet = new HashSet<String>();
    private SortedSet<String> stringSortedSet = new TreeSet<String>();
    private Collection<Integer> integerCollection = new ArrayList<Integer>();
    private List<Double> doubleList = new ArrayList<Double>();
    private Map<Integer, String> map = new HashMap<Integer, String>();
    private SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();
    private Set<Image> imagesComponentCollection = new HashSet<Image>();
    
    public CollectionMappings() {
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
     
    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public SortedSet<String> getStringSortedSet() {
        return stringSortedSet;
    }

    public void setStringSortedSet(SortedSet<String> stringSortedSet) {
        this.stringSortedSet = stringSortedSet;
    }

    public Collection<Integer> getIntegerCollection() {
        return integerCollection;
    }

    public void setIntegerCollection(Collection<Integer> integerCollection) {
        this.integerCollection = integerCollection;
    }

    public List<Double> getDoubleList() {
        return doubleList;
    }

    public void setDoubleList(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public SortedMap<Integer, String> getSortedMap() {
        return sortedMap;
    }

    public void setSortedMap(SortedMap<Integer, String> sortedMap) {
        this.sortedMap = sortedMap;
    }

    public Set<Image> getImagesComponentCollection() {
        return imagesComponentCollection;
    }

    public void setImagesComponentCollection(Set<Image> imagesComponentCollection) {
        this.imagesComponentCollection = imagesComponentCollection;
    }
   
}
