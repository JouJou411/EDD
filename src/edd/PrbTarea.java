/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.util.Arrays;

/**
 *
 * @author Jou
 */
public class PrbTarea
{
    public static void main(String[] args)
    {
        Tarea t = new Tarea();
        //Character arr[]={'(','a','+','b',')'};
        Character arr2[]={'(','(','(','a','+','b',')','-','c','*','d',')',')','/','e',')'};
        //arr = t.sufijoAPrefijo(arr);
        //System.out.println(Arrays.toString(arr));
        
        arr2= t.sufijoAPrefijo(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
