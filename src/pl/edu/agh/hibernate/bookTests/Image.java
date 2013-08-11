/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.util.Objects;

/**
 *
 * @author Krzysiu
 */
public class Image {
  
    private CollectionMappings collectionMapping;
    private String filename;
    private String name;
    private int sizeX;
    private int sizeY;

    public Image() {}
    
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public CollectionMappings getCollectionMapping() {
        return collectionMapping;
    }

    public void setCollectionMapping(CollectionMappings collectionMapping) {
        this.collectionMapping = collectionMapping;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.filename.hashCode();
        hash = 89 * hash + this.name.hashCode();
        hash = 89 * hash + this.sizeX;
        hash = 89 * hash + this.sizeY;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        final Image other = (Image) obj;
        if (!this.filename.equals(other.filename)) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.sizeX != other.sizeX) {
            return false;
        }
        if (this.sizeY != other.sizeY) {
            return false;
        }
        return true;
    }
    
}
