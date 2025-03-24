/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbColaCircular
{

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[5];
        Colas<Integer> p = new Colas<>(arr);
        p.inserta(5);
        p.inserta(10);
        p.inserta(15);
        p.inserta(20);
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        p.inserta(25);
        p.inserta(30);
        p.inserta(35);

        //System.out.println(p.busqueda(5));
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
    }
}
