/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbBicola
{

    public static void main(String[] args)
    {
        Character arr[] = new Character[5];
        Bicolas<Character> p = new Bicolas<>(arr);
        p.setA2(p.inserta('A', p.getA2(), p.getA1(), -1));
        p.setA1(p.inserta('X', p.getA1(), p.getA2(), 1));
        p.setA2(p.inserta('E', p.getA2(), p.getA1(), -1));
        p.setA1(p.inserta('Y', p.getA1(), p.getA2(), 1));

        Object de[];

        de = p.elimina(p.getA2(), p.getArr().length, -1);
        System.out.println(de[0]);
        p.setA2((int) de[1]);

        de = p.elimina(p.getA1(), -1, 1);
        System.out.println(de[0]);
        p.setA1((int) de[1]);
        
        /*
        (a+b)
        expresion en infijo operador en medio
        post fijo el operador va depues de los operando
        pilas vamos a transformar prefijo a postfijo
        */
        
    }
}
