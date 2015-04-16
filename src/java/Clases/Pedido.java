/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.*;

/**
 *
 * @author rcerrato
 */
public class Pedido {
    private GregorianCalendar fecha;
    private int id;
    
    public Pedido(int i, GregorianCalendar f){
        id=i;
        fecha=f;
    }
    public Pedido(int i){
        id=i;
    }

    /**
     * @return the fecha
     */
    public GregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
