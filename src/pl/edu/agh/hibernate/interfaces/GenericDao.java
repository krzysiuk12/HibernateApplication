package pl.edu.agh.hibernate.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Krzysiu
 */
public interface GenericDao<Template, ID extends Serializable> {
    
    Template findById(ID id);
    
    List<Template> findAll();
    
    List<Template> findAllByExample(Template exampleObject, List<String> excludedProperties);
    
    Template save(Template entity);
    
    void delete(Template entity);
    
    void flush();
    
    void clear();
    
}
