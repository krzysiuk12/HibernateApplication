/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.math.BigDecimal;

/**
 * Class contains build-in types mapping
 * 
 * @author Krzysztof Kicinger
 */
public class HibernateTypeSystemClass {
    
    private long id;
    
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private String characterValue;
    private String stringValue;
    private float floatValue;
    private double doubleValue;
    private BigDecimal bigDecimalValue;
    private boolean booleanValue;
    private boolean yesNoValue;
    private boolean trueFalseValue;

    public HibernateTypeSystemClass() {}
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }   
    
    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public String getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(String characterValue) {
        this.characterValue = characterValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public BigDecimal getBigDecimalValue() {
        return bigDecimalValue;
    }

    public void setBigDecimalValue(BigDecimal bigDecimalValue) {
        this.bigDecimalValue = bigDecimalValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean isYesNoValue() {
        return yesNoValue;
    }

    public void setYesNoValue(boolean yesNoValue) {
        this.yesNoValue = yesNoValue;
    }

    public boolean isTrueFalseValue() {
        return trueFalseValue;
    }

    public void setTrueFalseValue(boolean trueFalseValue) {
        this.trueFalseValue = trueFalseValue;
    }
    
}
