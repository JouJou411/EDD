/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ListaLSL
{

    private Nodo r;

    public ListaLSL(Nodo r)
    {
        this.r = r;
    }

    public ListaLSL()
    {
    }

    public Nodo getR()
    {
        return r;
    }

    public void setR(Nodo r)
    {
        this.r = r;
    }

    public void inserta(Nodo n)
    {
        if (n == null)
        {
            System.out.println("No se puede insertar un nodo nulo.");
            return;
        }

        if (r == null)
        {
            r = n;
            return;
        }

        if (r.getEt().compareTo(n.getEt()) > 0)
        {
            n.setSig(r);
            r = n;
            return;
        }

        Nodo aux = r;
        while (aux.getSig() != null && aux.getSig().getEt().compareTo(n.getEt()) < 0)
        {
            aux = aux.getSig();
        }

        n.setSig(aux.getSig());
        aux.setSig(n);
    }

    public String desp()
    {
        String s = "";
        Nodo aux = r;
        while (aux != null)
        {
            s += aux.getEt() + "\t";
            aux = aux.getSig();
        }
        return s;
    }

    public String despRecursivo(Nodo aux, String s)
    {
        if (aux != null)
        {
            s += aux.getEt() + "\t" + despRecursivo(aux.getSig(), s);
        }
        return s;
    }

    public Nodo elimina(Nodo n)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        if (r.getEt().compareTo(n.getEt()) > 0)
        {
            System.out.println("Nodo no encontrado");
            return null;
        }
        Nodo eliminado = null;
        if (r.getEt().compareTo(n.getEt()) == 0)
        {
            eliminado = r;
            r = r.getSig();
            eliminado.setSig(null);
            return eliminado;
        }
        Nodo aux = r;
        while (aux.getSig() != null)
        {
            if (aux.getSig().getEt().compareTo(n.getEt()) == 0)
            {
                eliminado = aux.getSig();
                aux.setSig(eliminado.getSig());
                eliminado.setSig(null);
                return eliminado;
            }
            aux = aux.getSig();
        }
        return eliminado;
    }
}
