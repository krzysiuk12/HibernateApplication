/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.application.main;

import java.util.List;
import pl.edu.agh.hibernate.bookTests.HibernateTypeSystemClass;
import pl.edu.agh.hibernate.bookTests.Rating;
import pl.edu.agh.hibernate.dao.bookTests.HibernateTypeSystemDao;

/**
 *
 * @author Krzysiu
 */
public class HibernateApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateTypeSystemDao hibernateTypeSystemClassDao = new HibernateTypeSystemDao();
        hibernateTypeSystemClassDao.generate(10);
        List<HibernateTypeSystemClass> allEntities = hibernateTypeSystemClassDao.findAllEntitiesWithRanking(Rating.OK);
        for(HibernateTypeSystemClass entity : allEntities) {
            System.out.println(entity.getId() + " " + entity.getMonetaryAmount().getAmount() + " " + entity.getMonetaryAmount().getCurrency().toString() + " " + entity.getRating().name());
        }
    }
}
