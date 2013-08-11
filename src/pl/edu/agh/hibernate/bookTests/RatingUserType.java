package pl.edu.agh.hibernate.bookTests;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.StringType;
import org.hibernate.usertype.UserType;

/**
 *
 * @author Krzysztof Kicinger
 */
public class RatingUserType implements UserType {

    @Override
    public int[] sqlTypes() {
        return new int[] { StringType.INSTANCE.sqlType() };
    }

    @Override
    public Class returnedClass() {
        return Rating.class;
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

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor session, Object owner) throws HibernateException, SQLException {
        String name = rs.getString(names[0]);
        return rs.wasNull() ? null : Enum.valueOf(Rating.class, name);
    }

    @Override
    public void nullSafeSet(PreparedStatement ps, Object value, int index, SessionImplementor session) throws HibernateException, SQLException {
        if(value == null) {
            ps.setNull(index, StringType.INSTANCE.sqlType());
        } else {
            ps.setString(index, ((Enum)value).name());
        }
    }

    @Override
    public Object deepCopy(Object o) throws HibernateException {
        return o;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object o) throws HibernateException {
        return (Serializable)o;
    }

    @Override
    public Object assemble(Serializable cached, Object o) throws HibernateException {
        return cached;
    }

    @Override
    public Object replace(Object original, Object o1, Object o2) throws HibernateException {
        return original;
    }
    
}
