/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author mario.vazquez
 */
public class Node {
    
    private String info;
    Node next;
    
    public Node(String i, Node n){
        info = i;
        next = n;
    }
    public String getInfo(){
        return this.info;
    }
    
    public void setInfo(String i){
        this.info = i;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
}
