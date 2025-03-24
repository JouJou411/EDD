/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbLibro
{

    public static void main(String[] args)
    {
        Libro libro = new Libro("El principito", "No se", "Tampoco lo se", 300, "Español", "14/03/1998", 157268, "1a", "digital", "cuentos de niños", "infantil");
        System.out.println(libro.toString());
    }
}
