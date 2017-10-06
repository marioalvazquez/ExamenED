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
public class Lista {
    public Nodo inicio = null;
    
    public Nodo fin = null;
    
    public void InsertarAlInicio(String info, Nodo n){
        Nodo temp = new Nodo(info, n);
    }
    
    public void InsertarAlFinal(String info, Nodo n){
        Nodo temp = new Nodo(info, n);
    }
    
    public void EliminarA(String info){
    
    }
    
    public void EliminarAlFInal(){
        
    }
}
