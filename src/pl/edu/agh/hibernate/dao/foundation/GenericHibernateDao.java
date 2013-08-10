/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.dao.foundation;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import pl.edu.agh.hibernate.bookTests.HibernateTypeSystemClass;
import pl.edu.agh.hibernate.foundation.HibernateUtil;
import pl.edu.agh.hibernate.interfaces.GenericDao;

/**
 * @author Krzysztof Kicinger
 */
public class GenericHibernateDao<Template, ID extends Serializable> implements GenericDao<Template, ID> {
    
    private Class<Template> persistentClass;
    private Session session = null;

    @Override
    public Template findById(ID id) {
        Criteria criteriaQuery = getSession().createCriteria(HibernateTypeSystemClass.class);
        criteriaQuery.add(Restrictions.eq("id", id));
        return (Template)criteriaQuery.uniqueResult();
    }

    @Override
    public List<Template> findAll() {
        Query query = getSession().getNamedQuery("findAllHibernateTypeSystem");
        return query.list();
    }

    @Override
    public List<Template> findAllByExample(Template exampleObject, List<String> excludedProperties) {
        Criteria criteriaQuery = getSession().createCriteria(getPersistentClass());
        Example example = Example.create(exampleObject);
        for(String excludeProperty : excludedProperties) {
            example.excludeProperty(excludeProperty);
        }
        criteriaQuery.add(example);
        return criteriaQuery.list();
    }

    @Override
    public Template save(Template entity) {
        (getSession().isOpen() ? getSession() : openSession()).beginTransaction();
            getSession().saveOrUpdate(entity);
        getSession().getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Template entity) {
        getSession().delete(entity);
    }

    @Override
    public void flush() {
        getSession().flush();
    }

    @Override
    public void clear() {
        getSession().clear();
    }

    public Class<Template> getPersistentClass() {
        return persistentClass;
    }
    
    public Session getSession() {
        if(session == null) {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        return session;
    }
    
    public Session openSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }
    
}
