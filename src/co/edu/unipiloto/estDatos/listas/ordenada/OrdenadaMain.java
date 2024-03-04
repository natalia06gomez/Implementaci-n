/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.estDatos.listas.ordenada;

/**
 *
 * @author USUARIO
 */
public class OrdenadaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ListaOrdenada<String> lista = new ListaOrdenada<>();
        System.out.println("La lista ordenada esta vacia? " + lista.isEmpty());
        System.out.println("El tamano de la lista es " + lista.size());
        lista.add("Pedro");
        for (String s : lista) {
            System.out.println(s.toString());
        }
        
        lista.add("Juan");
        System.out.println("Adicione Juan");
        System.out.println("----------------");
        for (String s : lista) {
            System.out.println(s.toString());
        }
        
        lista.add("Luis");
        System.out.println("Adicione Luis");
        System.out.println("----------------");    
        for (String s : lista) {
            System.out.println(s.toString());
        }
        
        lista.add("Sofia");
        System.out.println("Adicione Sofia");
        System.out.println("----------------");
        for (String s : lista) {
            System.out.println(s.toString());
        }
        System.out.println("----------------");
        System.out.println("Buscar Pedro " + lista.buscarEnLista ("Juan, Pedro, Sofia"));
    }

}
