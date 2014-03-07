/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poem.business;

import poem.domain.Poem;
import poem.data.PoemDAO;

/**
 *
 * @author Administrador
 */
public class PoemBusiness {
    
    PoemDAO poemDAO;

    public PoemBusiness() {
        this.poemDAO = poemDAO;
    }
    
    public Poem getPoem(){
        
        return this.poemDAO.getPoem();
        
    }
    
}
