/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbListasSLCircular
{

    public static void main(String[] args)
    {
        ListaSLCircular lSL = new ListaSLCircular();
        System.out.println(lSL.desp());
        Nodo n1 = new Nodo('1', "B");
        Nodo n2 = new Nodo('2', "A");
        Nodo n3 = new Nodo('3', "E");
        Nodo n4 = new Nodo('4', "C");
        Nodo n5 = new Nodo('5', "9");
        Nodo n6 = new Nodo('5', "15");
        Nodo n7 = new Nodo('5', "D");

        lSL.inserta(n1);
        lSL.inserta(n2);
        lSL.inserta(n3);
        lSL.inserta(n4);
        lSL.inserta(n5);
        System.out.println(lSL.desp());
        
        System.out.println(lSL.elimina(n4.getEtiqueta()));
        System.out.println(lSL.elimina(n6.getEtiqueta()));
        System.out.println(lSL.elimina(n2.getEtiqueta()));
        System.out.println(lSL.elimina(n7.getEtiqueta()));
        System.out.println(lSL.elimina(n3.getEtiqueta()));
        System.out.println(lSL.elimina(n1.getEtiqueta()));
        System.out.println(lSL.elimina(n1.getEtiqueta()));
    }
}
