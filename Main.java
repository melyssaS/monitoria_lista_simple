/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author melyssasolanodiaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListaSimple lista = new ListaSimple();
        
        lista.addPila(0);
        lista.addPila(1);
        lista.addPila(2);
        lista.addPila(3);
        lista.addPila(4);
        lista.addPila(5);
        
        lista.showList();
        
        System.out.println("***********************************");
        
        lista.addCola(6);
        lista.addCola(7);
        lista.addCola(8);
       
        lista.showList();
        
        System.out.println("***********************************");
        
        System.out.println(lista.searchNodo(5));
        
        System.out.println("***********************************");
        
        lista.deleteNodo(1);
        
        lista.showList();
        
        
    }
    
   
    
}
