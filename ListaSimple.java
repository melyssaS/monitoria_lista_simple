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
public class ListaSimple {

    private Nodo ptr;

    public ListaSimple() {

        ptr = null;

    }


    public void addPila(int n) {

        Nodo nodo = new Nodo(n);

        if (ptr == null) {

            ptr = nodo;

        } else {

            nodo.setLink(ptr);
            ptr = nodo;

        }

    }

    public void addCola(int n) {

        Nodo nodo = new Nodo(n);

        if (ptr == null) {

            ptr = nodo;
            
        } else {

            Nodo aux = ptr;

            while (aux.getLink() != null) {
                aux = aux.getLink();
            }

            aux.setLink(nodo);

        }

    }
    

    public boolean searchNodo(int n) {

        Nodo aux = ptr;

        while (aux != null) {
            if (aux.getDato() == n) {
                return true;
            } else {
                aux= aux.getLink();
            }
        }
        return false;

    }

    public void deleteNodo(int n) {

        Nodo actual = ptr;
        Nodo anterior = ptr;
        boolean sw = false;

        while (actual != null && sw == false) {
            
            if (actual.getDato() == n) {
                sw = true;
            }else{
                anterior=actual;
                actual=actual.getLink();
            }

        }

        if (sw == true) {
            if (actual == ptr) {
                actual = actual.getLink();
                ptr = actual;
                anterior.setLink(null);
            }else{
            
                anterior.setLink(actual.getLink());
                actual.setLink(null);
            }
        }

    }
    
       public void showList(){
    
        Nodo actual = ptr;
        while (actual!=null) {
            System.out.println(actual.getDato());
            actual=actual.getLink();
        }
          
    
    }

}
