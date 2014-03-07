/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poem.domain;

/**
 *
 * @author Administrador
 */
public class Poem {
    
    private String poema[];
    private String nombre;

    public Poem() {
    }

    public Poem(String[] poema, String nombre) {
        this.poema = poema;
        this.nombre = nombre;
    }

    public String[] getPoema() {
        return poema;
    }

    public void setPoema(String[] poema) {
        this.poema = poema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
