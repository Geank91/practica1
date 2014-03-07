/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poem.data;

import java.util.ArrayList;
import poem.domain.Poem;

/**
 *
 * @author Administrador
 */
public class PoemDAO {

    public PoemDAO() {
    }
    
    public Poem getPoem(){
        String arrayList[] = new String[4];
        arrayList[0] = "Verso 1";
        arrayList[1] = "Verso 2";
        arrayList[2] = "Verso 3";
        arrayList[3] = "Verso 4";
        Poem poem = new Poem(arrayList, "Poema 1");
        return poem;
    }
    
    
    
        
    
    
}
