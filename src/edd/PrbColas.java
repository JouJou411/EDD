/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbColas
{

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[5];
        Colas<Integer> p = new Colas<>(arr);
        p.inserta(5);
        p.inserta(2);
        p.inserta(10);
        p.inserta(14);
        p.inserta(9);
        p.inserta(8);

        //System.out.println(p.busqueda(5));
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
        System.out.println(p.elimina());
    }
}
