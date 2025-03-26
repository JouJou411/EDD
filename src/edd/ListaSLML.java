/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ListaSLML
{

    private NodoML r;

    public ListaSLML(NodoML r)
    {
        this.r = r;
    }

    public ListaSLML()
    {
    }

    public NodoML getR()
    {
        return r;
    }

    public void setR(NodoML r)
    {
        this.r = r;
    }

    public void inserta(NodoML n)
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

        NodoML aux = r;
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
        NodoML aux = r;
        while (aux != null)
        {
            s += aux.getEt() + "\t";
            aux = aux.getSig();
        }
        return s;
    }

    public String despRecursivo(NodoML aux, String s)
    {
        if (aux != null)
        {
            s += aux.getEt() + "\t" + despRecursivo(aux.getSig(), s);
        }
        return s;
    }

    public NodoML elimina(NodoML n)
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
        NodoML eliminado = null;
        if (r.getEt().equals(n.getEt()))
        {
            eliminado = r;
            r = r.getSig();
            eliminado.setSig(null);
            return eliminado;
        }
        NodoML aux = r;
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
