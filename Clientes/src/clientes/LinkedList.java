/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author mario.vazquez
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List l = new List();
        System.out.println("Bienvenido al sistema de Listas simplemente enlazadas");
        Menu(l);


    }
    
    public static void Menu(List l){
        Scanner reader = new Scanner(System.in);
        int selected = 0;
        while(selected != 7){
         System.out.println("Qué deseas hacer?");
        System.out.println("1. Insertar al inicio");
        System.out.println("2. Insertar después de elemento");
        System.out.println("3. Insertar al final");
        System.out.println("4. Eliminar el final");
        System.out.println("5. Remover por elemento");
        System.out.println("6. Imprimir lista");
        System.out.println("7. Salir");
        selected = reader.nextInt();
        String toAdd;
        switch(selected){
            case 1:
                System.out.println("Ingrese el elemento que desea agregar a la lista");
                reader.nextLine();
                toAdd = reader.nextLine();
                l.InsertBegining(toAdd);
                break;
            case 2:
                System.out.println("Después de qué elemento desea insertar?");
                reader.nextLine();
                String addAfter = reader.nextLine();
                System.out.println("Ingrese el elemento que desea agregar");
                reader.nextLine();
                toAdd = reader.nextLine();
                l.InsertAfter(addAfter, toAdd);
                break;
            case 3:
                System.out.println("Ingrese el elemento a agregar:");
                reader.nextLine();
                toAdd = reader.nextLine();
                l.InsertEnd(toAdd);
                break;
            case 4:
                try{
                    l.DeleteEnd();
                    System.out.println("Se ha removido satisfactoriamente");
                }
                catch(Exception i){
                    System.out.println("Algo salió mal");
                }
                break;
            case 5:
                System.out.println("¿Qué elemento deseas remover?");
                reader.nextLine();
                String toRemove = reader.nextLine();
                l.RemoveNode(toRemove);
                break;
            case 6:
                l.ShowList();
                break;
            case 7:
                System.exit(0);
                break;
        }   
        }
    }
    
}
