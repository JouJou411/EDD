/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbColaDinamica
{

    public static void main(String[] args)
    {
        Nodo<String> n1 = new Nodo("A", "A");
        Nodo<String> n2 = new Nodo("B", "B");
        Nodo<String> n3 = new Nodo("C", "C");
        Nodo<String> n4 = new Nodo("D", "D");

        ColaDinamica p = new ColaDinamica();

        p.inserta(n1);
        p.inserta(n2);
        p.inserta(n3);
        p.inserta(n4);

        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
    }
}
