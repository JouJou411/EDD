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

        ArbolBinario ab = new ArbolBinario();

        ab.setR(ab.inserta(ab.getR(), na4));
        ab.setR(ab.inserta(ab.getR(), na2));
        ab.setR(ab.inserta(ab.getR(), na1));
        ab.setR(ab.inserta(ab.getR(), na3));
        ab.setR(ab.inserta(ab.getR(), na6));
        ab.setR(ab.inserta(ab.getR(), na5));
        ab.setR(ab.inserta(ab.getR(), na7));

        System.out.println(ab.recOrden(ab.getR(), ""));
        System.out.println(ab.recPreOrden(ab.getR(), ""));
        System.out.println(ab.recPostOrden(ab.getR(), ""));
    }
}
