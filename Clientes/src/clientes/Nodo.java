/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author PC5
 */
public class Nodo {
    public Nodo siguiente;
    public String info;
    
    public Nodo(String i, Nodo next){
        this.info = i;
        this.siguiente = next;
    }
}
