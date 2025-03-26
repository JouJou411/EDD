/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbListasLSL
{
    public static void main(String[] args)
    {
        ListaLSL lSL = new ListaLSL();
        Nodo n1 = new Nodo('A', "B");
        Nodo n2 = new Nodo('B', "A");
        Nodo n3 = new Nodo('C', "D");
        Nodo n4 = new Nodo('D', "C");
        
        lSL.inserta(n1);
        lSL.inserta(n2);
        lSL.inserta(n3);
        lSL.inserta(n4);
        
        System.out.println(lSL.desp());
        System.out.println(lSL.despRecursivo(lSL.getR(),""));
        
        //System.out.println(n1.getEt().compareTo(n1.getEt()));
        
        System.out.println(lSL.elimina(n4));
        System.out.println(lSL.elimina(n2));
        System.out.println(lSL.elimina(n2));
        System.out.println(lSL.elimina(n3));
        System.out.println(lSL.elimina(n1));
        System.out.println(lSL.elimina(n1));
    }
}
