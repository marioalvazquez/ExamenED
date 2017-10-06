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
public class List {
    Node begining;
    Node end;
    
    public List(){
        begining = null;
        end = null;
    }
    
    public void InsertBegining(String info){
        Node newNode = new Node(info, begining);
        begining = newNode;
        if (end == null)
            end = begining;
    }
    
    public void InsertAfter(String afterMe, String toInsert){
        Node tmp = begining;
        while(tmp != null && !tmp.getInfo().equals(afterMe)){
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.next = new Node(toInsert, tmp.next);
        }
    }
    
    public void InsertEnd(String info){
        Node tempNode = new Node(info, null);
        if (begining == null) {
            end = tempNode;
            begining = end;
        }
        else{
            end.setNext(tempNode);
            end = tempNode;
        }
    }
    
    public void DeleteEnd(){
        begining = begining.next;
    }
    
    public void RemoveNode(String toDelete){
        if (begining.getInfo().equals(toDelete)) {
            begining = begining.next;
        }
        Node curr = begining;
        Node prev = null;
        
        while(curr != null && !curr.getInfo().equals(toDelete)){
            prev = curr;
            curr = curr.next;   
        }
        if (curr == null)
            throw new RuntimeException("cannot delete");
        
        prev.next = curr.next;
    }
    
    public String GetBegining(){
        String info = begining.getInfo();
        begining = begining.getNext();
        if (begining == null) {
            end = null;
        }
        return info;
    }
    
    public void ShowList(){
        Node temp = begining;
        while(temp != null){
            System.out.println(temp.getInfo());
            temp = temp.next;
        }
    }
    
}
