/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Jou
 */
public class ColaCircularDinamica
{

    private Nodo a;

    public ColaCircularDinamica(Nodo a)
    {
        this.a = a;
    }

    public ColaCircularDinamica()
    {
    }

    public Nodo getA()
    {
        return a;
    }

    public void setA(Nodo a)
    {
        this.a = a;
    }

    public void inserta(Nodo n)
    {
        if (n == null)
        {
            System.out.println("No se puede insertar");
        } else
        {
            if (a == null)
            {
                a = n;
            }
            n.setSig(a.getSig());
            a.setSig(n);
            a = a.getSig();
        }
    }

    public Nodo elimina()
    {
        if (a == null)
        {
            System.out.println("Cola circular vacia");
            return null;
        }
        Nodo n = a.getSig();
        if (a == n)
        {
            a = null;
        } else
        {
            a.setSig(n.getSig());
        }
        n.setSig(null);
        return n;
    }
}
