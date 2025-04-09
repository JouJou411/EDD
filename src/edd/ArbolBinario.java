/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ArbolBinario
{

    private NodoArbol r;

    public NodoArbol getR()
    {
        return r;
    }

    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    public NodoArbol inserta(NodoArbol r, NodoArbol obj)
    {
        if (r == null)
        {
            return obj;
        } else
        {
            if (r.getEt().compareTo(obj.getEt()) > 0)
            {
                r.setIzq(inserta(r.getIzq(), obj));
            } else
            {
                r.setDer(inserta(r.getDer(), obj));
            }
            return r;
        }

    }

    public String recOrden(NodoArbol r, String s)
    {
        if (r != null)
        {
            s += recOrden(r.getIzq(), "");
            s += r.getEt();
            s += recOrden(r.getDer(), "");
        }
        return s;
    }

    public String recPreOrden(NodoArbol r, String s)
    {
        if (r != null)
        {
            s += r.getEt();
            s += recPreOrden(r.getIzq(), "");
            s += recPreOrden(r.getDer(), "");
        }
        return s;
    }

    public String recPostOrden(NodoArbol r, String s)
    {
        if (r != null)
        {
            s += recPostOrden(r.getIzq(), "");
            s += recPostOrden(r.getDer(), "");
            s += r.getEt();
        }
        return s;
    }

//    public NodoArbol elimina()
//    {
//
//    }
}
