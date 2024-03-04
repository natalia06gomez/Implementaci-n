/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estDatos.listas.ordenada;

import java.util.Iterator;

/**
 *
 * @author USUARIO
 */
public class ListaOrdenada<Item extends Comparable<? super Item>> implements Iterable<Item> {

    Node primero;

    private class Node {

        Item item;
        Node next;

        //constructor
        private Node() {
            this.next = null;
            this.item = null;
        }

        private Node(Item item) {
            this.item = item;
            this.next = null;
        }

    }

    //COnstructor
    public ListaOrdenada() {
        primero = null;
    }

    //Metodos API
    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        Node recorre = primero;
        return size(recorre);
    }

    //Adicionar un elemento a la lista ordenada, garantizando que siga ordenada
    public void add(Item item) {
        Node actual = null;
        //Inicializar el elemento a adicionar
        Node nuevo = new Node(item);
        //UNa lista ordenada es null
        if (primero == null) {
            //UNa lista con un elemento es una lista ordenada
            System.out.println("lista con un unico elemento");
            primero = nuevo;
            return;
        }
        actual = primero;
        //El nuevo elemento es el primero de la lista
        if (item.compareTo(actual.item) <= 0) {
            System.out.println("El nuevo elemento es ahora el primero de la lista");
            nuevo.next = primero;
            primero = nuevo;
            return;
        }
        //EL nuevo elemento se adiciona entre otros
        while (actual.next!=null && item.compareTo(actual.next.item) > 0) {
                actual = actual.next;
            }
        //Agregar el elemento entre actual y actual.next
        System.out.println("El nuevo elemento se adiciona entre dos nodos o al final");
        nuevo.next=actual.next;
        actual.next=nuevo;
        return;

    }

    public int size(Node temp) {
        if (temp == null) {
            return 0;
        }
        return 1 + size(temp.next);
    }

        public boolean buscarEnLista(Node actual, Item item){
            if (actual==null){
                return false;
            }
            
            if (item.equals(actual.item)){
                return true;
                
            }
            
            if (item.compareTo(actual.item) <0){
                return false;
                
            }
            
            return buscarEnLista( actual.next,item);
        }
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        //Declarar un atributo que tenga la referencia al primero
        private Node actual = primero;

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public Item next() {
            Item item = actual.item;
            actual = actual.next;
            return item;
        }

    }

}
