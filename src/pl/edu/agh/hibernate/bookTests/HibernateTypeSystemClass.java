/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Class contains build-in types mapping
 * 
 * @author Krzysiu
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

    private Date dateValue;
    private Time timeValue;
    private Timestamp timestampValue;
    private Calendar calendarValue;
    private Calendar calendarDateValue;
    
    private byte[] binaryValue;
    private String textValue;
    private Clob clobValue;
    private Blob blobValue;
    
    private Class classValue;
    private Locale localeValue;
    private TimeZone timezoneValue;
    private Currency currencyValue;
    
    private MonetaryAmount monetaryAmount;
    
    private Rating rating;
    
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

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Time getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Time timeValue) {
        this.timeValue = timeValue;
    }

    public Timestamp getTimestampValue() {
        return timestampValue;
    }

    public void setTimestampValue(Timestamp timestampValue) {
        this.timestampValue = timestampValue;
    }

    public Calendar getCalendarValue() {
        return calendarValue;
    }

    public void setCalendarValue(Calendar calendarValue) {
        this.calendarValue = calendarValue;
    }

    public Calendar getCalendarDateValue() {
        return calendarDateValue;
    }

    public void setCalendarDateValue(Calendar calendarDateValue) {
        this.calendarDateValue = calendarDateValue;
    }

    public byte[] getBinaryValue() {
        return binaryValue;
    }

    public void setBinaryValue(byte[] binaryValue) {
        this.binaryValue = binaryValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Clob getClobValue() {
        return clobValue;
    }

    public void setClobValue(Clob clobValue) {
        this.clobValue = clobValue;
    }

    public Blob getBlobValue() {
        return blobValue;
    }

    public void setBlobValue(Blob blobValue) {
        this.blobValue = blobValue;
    }

    public Class getClassValue() {
        return classValue;
    }

    public void setClassValue(Class classValue) {
        this.classValue = classValue;
    }

    public Locale getLocaleValue() {
        return localeValue;
    }

    public void setLocaleValue(Locale localeValue) {
        this.localeValue = localeValue;
    }

    public TimeZone getTimezoneValue() {
        return timezoneValue;
    }

    public void setTimezoneValue(TimeZone timezoneValue) {
        this.timezoneValue = timezoneValue;
    }

    public Currency getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Currency currencyValue) {
        this.currencyValue = currencyValue;
    }

    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
    
}
