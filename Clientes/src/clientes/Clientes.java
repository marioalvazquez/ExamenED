/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.Scanner;

/**
 *
 * @author PC5
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al Sistema de Control de Lista de Clientes");
        Scanner lector = new Scanner(System.in);
        int desicion = 0;
        Lista clientes = new Lista();
        Iniciar(lector, desicion, clientes);
    }
    
    
    public static void Iniciar(Scanner lector, int desicion, Lista clientes){
        System.out.println("¿Qué desea hacer ahora?");
        System.out.println("1. Alta de Cliente");
        System.out.println("2. Baja de Cliente");
        System.out.println("3. Imprimir Lista");
        System.out.println("4. Salir del Sistema");
        desicion = lector.nextInt();
        switch(desicion){
            case 1:
                AltaCliente(lector, 0, clientes);
                break;
            case 2:
                BajaCliente(lector, 0, clientes);
                break;
            case 3:
                ImprimirLista(lector, 0, clientes);
                break;
            case 4:
                Salir();
                break;
            default:
                break;
        }
    }
    
    public static void AltaCliente(Scanner lector, int desicion, Lista clientes){
        System.out.println("1. Alta al inicio de la lista");
        System.out.println("2. Alta al final de la lista");
        System.out.println("3. Salir del menú");
        desicion = lector.nextInt();
        switch(desicion){
            case 1:
                System.out.println("Ingrese el nombre del cliente:");
                System.out.println("");
                String cliente = lector.nextLine();
                clientes.InsertarAlInicio(cliente, null);
                break;
            case 2:
                BajaCliente(lector, 0, clientes);
                break;
            case 3:
                SalirMenu(lector, 0, clientes);
                break;
            default:
                break;
        }
    }
    
    public static void BajaCliente(Scanner lector, int desicion, Lista clientes){
        System.out.println("1. Baja al final de la lista");
        System.out.println("2. Baja de un cliente en especial en la lista");
        System.out.println("3. Salir del menú");
        desicion = lector.nextInt();
        switch(desicion){
            case 1:
                AltaCliente(lector, 0, clientes);
                break;
            case 2:
                BajaCliente(lector, 0, clientes);
                break;
            case 3:
                SalirMenu();
                break;
            default:
                break;
        }
    }
    
    public static void ImprimirLista(Scanner lector, int desicion, Lista clientes){
        
        Iniciar(lector, 0, clientes);
    }
    
    public static void Salir(){
        System.out.println("** Gracias por usar el sistema **");
        System.out.println("");
        System.out.println("Autor: Mario Alberto Vázquez López");
        System.out.println("Versión: 1.0");
        System.exit(0);
    }

    private static void SalirMenu(Scanner lector, int desicion, Lista clientes) {
        Iniciar(lector, desicion, clientes);
    }
    
}
