/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.hibernate.dao.bookTests;

import pl.edu.agh.application.main.interfaces.IGenerator;
import pl.edu.agh.hibernate.bookTests.HibernateTypeSystemClass;
import pl.edu.agh.hibernate.dao.foundation.GenericHibernateDao;

/**
 * Java Persistence With Hiberate Book
 * Chapter 5
 * 
 * Class created to test all aspects concerned in Hibernate Type System subchapter.
 * 
 * @author Krzysztof Kicinger
 */
public class HibernateTypeSystemDao extends GenericHibernateDao<HibernateTypeSystemClass, Long> implements IGenerator {

    @Override
    public void generate(int numberOfObjectsToGenerate) {
        for(int iterator = 0; iterator < numberOfObjectsToGenerate; iterator++) {
            this.save(new HibernateTypeSystemClass());
        }
    }
}
