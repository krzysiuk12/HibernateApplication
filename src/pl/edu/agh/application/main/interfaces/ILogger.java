/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.agh.application.main.interfaces;

/**
 * Interface for Logging Service
 * 
 * @author Krzysiu
 */
public interface ILogger {
    
    public void trace(Object message);
   
    public void debug(Object message);
    
    public void info(Object message);
    
    public void warn(Object message);
    
    public void error(Object message);
    
    public void fatal(Object message);
    
}
