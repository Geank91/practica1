/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poem.view;

import poem.business.PoemBusiness;
import poem.domain.Poem;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PoemBusiness poemBusiness = new PoemBusiness();
        Poem poemBus = poemBusiness.getPoem();
        System.out.println(poemBus.getNombre()+ " " +poemBus.getPoema());
        
    }
}
