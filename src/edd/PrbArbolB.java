/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbArbolB
{

    public static void main(String[] args)
    {
        NodoArbol na1 = new NodoArbol("A", "A");
        NodoArbol na2 = new NodoArbol("B", "B");
        NodoArbol na3 = new NodoArbol("C", "C");
        NodoArbol na4 = new NodoArbol("D", "D");
        NodoArbol na5 = new NodoArbol("E", "E");
        NodoArbol na6 = new NodoArbol("F", "F");
        NodoArbol na7 = new NodoArbol("G", "G");
        NodoArbol na8 = new NodoArbol("H", "H");
        NodoArbol na9 = new NodoArbol("I", "I");
        NodoArbol na10 = new NodoArbol("J", "J");
        NodoArbol na11 = new NodoArbol("K", "K");
        NodoArbol na12 = new NodoArbol("L", "L");
        NodoArbol na13 = new NodoArbol("M", "M");
        NodoArbol na14 = new NodoArbol("N", "N");
        NodoArbol na15 = new NodoArbol("O", "O");

        ArbolBinario ab = new ArbolBinario();

//        ab.setR(ab.inserta(ab.getR(), na4));
//        ab.setR(ab.inserta(ab.getR(), na2));
//        ab.setR(ab.inserta(ab.getR(), na1));
//        ab.setR(ab.inserta(ab.getR(), na3));
//        ab.setR(ab.inserta(ab.getR(), na6));
//        ab.setR(ab.inserta(ab.getR(), na5));
//        ab.setR(ab.inserta(ab.getR(), na7));

        ab.setR(ab.insertaAVL(ab.getR(), na1));
        ab.setR(ab.insertaAVL(ab.getR(), na2));
        ab.setR(ab.insertaAVL(ab.getR(), na3));
        ab.setR(ab.insertaAVL(ab.getR(), na4));
        ab.setR(ab.insertaAVL(ab.getR(), na5));
        ab.setR(ab.insertaAVL(ab.getR(), na6));
        ab.setR(ab.insertaAVL(ab.getR(), na7));
        ab.setR(ab.insertaAVL(ab.getR(), na8));
        ab.setR(ab.insertaAVL(ab.getR(), na9));
        ab.setR(ab.insertaAVL(ab.getR(), na10));
        ab.setR(ab.insertaAVL(ab.getR(), na11));
        ab.setR(ab.insertaAVL(ab.getR(), na12));
        ab.setR(ab.insertaAVL(ab.getR(), na13));
        ab.setR(ab.insertaAVL(ab.getR(), na14));
        ab.setR(ab.insertaAVL(ab.getR(), na15));

        System.out.println(ab.recOrden(ab.getR(), ""));
        System.out.println(ab.recPreOrden(ab.getR(), ""));
        System.out.println(ab.recPostOrden(ab.getR(), ""));
        
        ab.imprimirArbol(ab.getR(), 0);
    }
}
