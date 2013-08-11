/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.bookTests;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Currency;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.CurrencyType;
import org.hibernate.type.Type;
import org.hibernate.usertype.CompositeUserType;
import org.hibernate.usertype.ParameterizedType;

/**
 *
 * @author Krzysiu
 */
public class MonetaryAmountUserType implements CompositeUserType {
    
    /**
     * Tells Hibernate what SQL Column Types to use for DDL Schema Generation.
     * 
     * @return Return Value can map single property to multiple columns - we let hibernate decide to which type to map it 
     */
    //@Override
    //public int[] sqlTypes() {
    //    return new int[] { new BigDecimalType().sqlType() };
    //}

    /**
     * What Java Value Type Class is mapped
     * @return 
     */
    @Override
    public Class returnedClass() {
        return MonetaryAmount.class;
    }
    
    @Override
    public boolean equals(Object o, Object o1) throws HibernateException {
        if(o == null || o1 == null) {
            return false;
        }
        return o.equals(o1);
    }

    @Override
    public int hashCode(Object o) throws HibernateException {
        return o.hashCode();
    }

    /**
     * Method retrieves the property value from the JDBC ResultSet.
     * You can also access the owner of the component if you need it for conversion.
     * 
     * @param resultSet
     * @param names
     * @param session
     * @param owner
     * @return
     * @throws HibernateException
     * @throws SQLException 
     */
    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] names, SessionImplementor session, Object owner) throws HibernateException, SQLException {
        BigDecimal bigDecimalValue = resultSet.getBigDecimal(names[0]);
        Currency currency = Currency.getInstance(resultSet.getString(names[1]) != null  ? resultSet.getString(names[1]) : "USD");
        if(bigDecimalValue == null || currency == null) {
            return null;
        }
        return new MonetaryAmount(bigDecimalValue, currency);
    }

    /**
     * Writes the property value to the JDBC Prepared Statement
     * 
     * @param preparedStatement
     * @param value
     * @param index
     * @param session
     * @throws HibernateException
     * @throws SQLException 
     */
    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Object value, int index, SessionImplementor session) throws HibernateException, SQLException {
        if(value == null) {
            preparedStatement.setNull(index, BigDecimalType.INSTANCE.sqlType());
            preparedStatement.setNull(index + 1, CurrencyType.INSTANCE.sqlType());
        } else {
            MonetaryAmount monetaryAmount = (MonetaryAmount)value;
            preparedStatement.setBigDecimal(index, monetaryAmount.getAmount());
            preparedStatement.setString(index + 1, monetaryAmount.getCurrency().getCurrencyCode());
        }
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    @Override
    public boolean isMutable() {
        return false;
    }
    
    /**
     * Method is called when Hibernate puts a value to a Second-Level Cache - stores data in Serializable Form
     * @param value
     * @return
     * @throws HibernateException 
     */
    @Override
    public Serializable disassemble(Object value, SessionImplementor session) throws HibernateException {
        return (Serializable)value;
    }

    /**
     * Transformes cached data into an instance of MonetaryAmount
     * @param cached
     * @param owner
     * @return
     * @throws HibernateException 
     */
    @Override
    public Object assemble(Serializable cached, SessionImplementor session, Object owner) throws HibernateException {
        return cached;
    }

    /**
     * Handles merging from detechad state object. The state of Original Object and Target Object must be combined.
     * For Immutable Value Types return first argument.
     * For Mutable Value Types at least return deepCopy() of the first argument + recursive merging for component fields.
     * 
     * @param original
     * @param target
     * @param owner
     * @return
     * @throws HibernateException 
     */
    @Override
    public Object replace(Object original, Object target, SessionImplementor session, Object owner) throws HibernateException {
        return original;
    }

    @Override
    public String[] getPropertyNames() {
        return new String[] { "amount", "currency" };
    }

    @Override
    public Type[] getPropertyTypes() {
        return new Type[] { BigDecimalType.INSTANCE, CurrencyType.INSTANCE }; 
    }

    @Override
    public Object getPropertyValue(Object component, int property) throws HibernateException {
        MonetaryAmount monetaryAmount = (MonetaryAmount)component;
        if(property == 0) {
            return monetaryAmount.getAmount();
        } else {
            return monetaryAmount.getCurrency();
        }
    }

    @Override
    public void setPropertyValue(Object component, int property, Object value) throws HibernateException {
        throw new UnsupportedOperationException("Immutable MonetaryAmount!!!");
    }
   
}
