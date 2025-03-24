/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbListasDL
{

    public static void main(String[] args)
    {
        ListaDL lDL = new ListaDL();
        NodoD n1 = new NodoD('A', "B");
        NodoD n2 = new NodoD('B', "A");
        NodoD n3 = new NodoD('C', "D");
        NodoD n4 = new NodoD('D', "C");

        lDL.inserta(n1);
        lDL.inserta(n2);
        lDL.inserta(n3);
        lDL.inserta(n4);

        System.out.println(lDL.desp());
//        System.out.println(lDL.despRecursivo(lDL.getR(),""));
//        
//        System.out.println(n1.getEtiqueta().compareTo(n2.getEtiqueta()));
//        System.out.println(n1.getEtiqueta().compareTo(n4.getEtiqueta()));
        System.out.println(lDL.elimina("D"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("B"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("A"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("F"));
        System.out.println(lDL.desp());
        System.out.println(lDL.elimina("C"));
        System.out.println(lDL.desp());

        System.out.println(lDL.elimina("A"));
    }
}
