/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbListasDLCircular
{

    public static void main(String[] args)
    {
        ListaDLCircular lDL = new ListaDLCircular();
//        System.out.println(lDL.desp());
        NodoD n1 = new NodoD('1', "B");
        NodoD n2 = new NodoD('2', "1");
        NodoD n3 = new NodoD('3', "10");
        NodoD n4 = new NodoD('4', "C");
        NodoD n5 = new NodoD('5', "2");

        lDL.inserta(n1);
        System.out.println(lDL.desp());
        System.out.println("");
        lDL.inserta(n2);
        System.out.println(lDL.desp());
        System.out.println("");
        lDL.inserta(n3);
        System.out.println(lDL.desp());
        System.out.println("");
        lDL.inserta(n4);
        System.out.println(lDL.desp());
        System.out.println("");
        lDL.inserta(n5);
        System.out.println(lDL.desp());
        System.out.println("");

//        System.out.println(n3.getEt().compareTo("10"));
//        System.out.println(n3.getEt().compareTo("F"));
        System.out.println(lDL.elimina("F"));
        System.out.println(lDL.elimina("C"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("15"));
        System.out.println(lDL.elimina("A"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("D"));
        System.out.println(lDL.elimina("E"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("B"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("9"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("9"));

    }
}
