/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.application.main.interfaces;

/**
 *
 * @author Krzysiu
 */
public interface IGenerator<Template> {
 
    public void generate(int numberOfObjectsToGenerate);
    
    public Template generateEntity();

}
