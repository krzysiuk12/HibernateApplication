/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.dao.bookTests;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import org.hibernate.Query;
import pl.edu.agh.application.main.interfaces.IGenerator;
import pl.edu.agh.hibernate.bookTests.HibernateTypeSystemClass;
import pl.edu.agh.hibernate.bookTests.MonetaryAmount;
import pl.edu.agh.hibernate.bookTests.Rating;
import pl.edu.agh.hibernate.dao.foundation.GenericHibernateDao;

/**
 * Java Persistence With Hiberate Book
 * Chapter 5
 * 
 * Class created to test all aspects concerned in Hibernate Type System subchapter.
 * 
 * @author Krzysztof Kicinger
 */
public class HibernateTypeSystemDao extends GenericHibernateDao<HibernateTypeSystemClass, Long> implements IGenerator<HibernateTypeSystemClass> {

    @Override
    public void generate(int numberOfObjectsToGenerate) {
        for(int iterator = 0; iterator < numberOfObjectsToGenerate; iterator++) {
            this.save(generateEntity());
        }
    }
    
    @Override
    public HibernateTypeSystemClass generateEntity() {
        HibernateTypeSystemClass hibernateTypeSystemClass = new HibernateTypeSystemClass();
        hibernateTypeSystemClass.setMonetaryAmount(new MonetaryAmount(BigDecimal.valueOf(Math.random()), Currency.getInstance(Math.random() > 0.5 ? "USD" : "EUR")));
        hibernateTypeSystemClass.setRating(Math.random() > 0.5 ? Rating.OK : Rating.EXCELLENT);
        return hibernateTypeSystemClass;
    }
    
    public List<HibernateTypeSystemClass> findAllEntitiesWithRanking(Rating ranking) {
        Query namedQuery = getSession().getNamedQuery("findAllEntitiesWithRanking");
        namedQuery.setParameter("rating", ranking);
        return namedQuery.list();
    }
}
