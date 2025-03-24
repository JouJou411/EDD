/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ColaPrioridad
{

    Integer[] ar2 = new Integer[5];
    Integer[] ar3 = new Integer[5];
    Integer[] ar4 = new Integer[5];

    public void prioridad()
    {
        Pilas<Integer> p1 = new Pilas<>(ar2);
        Pilas<Integer> p2 = new Pilas<>(ar3);
        Colas<Integer> c = new Colas<>(ar4);
        c.inserta(5);
        c.inserta(10);
        c.inserta(15);
        c.inserta(30);
        c.inserta(25);
        c.inserta(20);

        Integer ec, ep;
        ec = 0;

        while (!c.vacia())
        {
            while (!p1.vacia())
            {
                ep = p1.elimina();
                if (ec < ep)
                {
                    p1.inserta(ep);
                    break;
                } else
                {
                    p2.inserta(ep);
                }
                p1.inserta(ec);
            }
            p1.inserta(ec);
        }
    }
}
