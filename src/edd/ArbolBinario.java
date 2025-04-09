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

    private int altura(NodoArbol n)
    {
        return n == null ? 0 : n.getAltura();
    }

    private int getBalance(NodoArbol n)
    {
        return n == null ? 0 : altura(n.getIzq()) - altura(n.getDer());
    }

    private NodoArbol rotacionDerecha(NodoArbol y)
    {
        NodoArbol x = y.getIzq();
        NodoArbol T2 = x.getDer();

        x.setDer(y);
        y.setIzq(T2);

        y.setAltura(Math.max(altura(y.getIzq()), altura(y.getDer())) + 1);
        x.setAltura(Math.max(altura(x.getIzq()), altura(x.getDer())) + 1);

        return x;
    }

    private NodoArbol rotacionIzquierda(NodoArbol x)
    {
        NodoArbol y = x.getDer();
        NodoArbol T2 = y.getIzq();

        y.setIzq(x);
        x.setDer(T2);

        x.setAltura(Math.max(altura(x.getIzq()), altura(x.getDer())) + 1);
        y.setAltura(Math.max(altura(y.getIzq()), altura(y.getDer())) + 1);

        return y;
    }

    public NodoArbol insertaAVL(NodoArbol nodo, NodoArbol obj)
    {
        if (nodo == null)
        {
            return obj;
        }
        if (obj.getEt().compareTo(nodo.getEt()) < 0)
        {
            nodo.setIzq(insertaAVL(nodo.getIzq(), obj));
        } else if (obj.getEt().compareTo(nodo.getEt()) > 0)
        {
            nodo.setDer(insertaAVL(nodo.getDer(), obj));
        } else
        {
            return nodo;
        }
        nodo.setAltura(1 + Math.max(altura(nodo.getIzq()), altura(nodo.getDer())));

        int balance = getBalance(nodo);

        if (balance > 1 && obj.getEt().compareTo(nodo.getIzq().getEt()) < 0)
        {
            return rotacionDerecha(nodo);
        }
        if (balance < -1 && obj.getEt().compareTo(nodo.getDer().getEt()) > 0)
        {
            return rotacionIzquierda(nodo);
        }
        if (balance > 1 && obj.getEt().compareTo(nodo.getIzq().getEt()) > 0)
        {
            nodo.setIzq(rotacionIzquierda(nodo.getIzq()));
            return rotacionDerecha(nodo);
        }
        if (balance < -1 && obj.getEt().compareTo(nodo.getDer().getEt()) < 0)
        {
            nodo.setDer(rotacionDerecha(nodo.getDer()));
            return rotacionIzquierda(nodo);
        }
        return nodo;
    }

    public void imprimirArbol(NodoArbol nodo, int nivel)
    {
        if (nodo != null)
        {
            imprimirArbol(nodo.getDer(), nivel + 1);
            for (int i = 0; i < nivel; i++)
            {
                System.out.print("    ");
            }
            System.out.println(nodo.getEt());
            imprimirArbol(nodo.getIzq(), nivel + 1);
        }
    }
}
