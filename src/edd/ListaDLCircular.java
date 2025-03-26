/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ListaDLCircular
{

    private NodoD r;

    public ListaDLCircular()
    {
    }

    public ListaDLCircular(NodoD r)
    {
        this.r = r;
    }

    public NodoD getR()
    {
        return r;
    }

    public void setR(NodoD r)
    {
        this.r = r;
    }

    public void inserta(NodoD n)
    {
        if (r == null)
        {
            r = n;
            n.setSig(n);
            n.setAnt(n);
        } else
        {
            NodoD aux = r.getSig();
            if (n.getEt().compareTo(aux.getEt()) < 0 || n.getEt().compareTo(r.getEt()) > 0)
            {
                n.setSig(aux);
                n.setAnt(r);
                aux.setAnt(n);
                r.setSig(n);
                if (n.getEt().compareTo(r.getEt()) > 0)
                {
                    r = n;
                }
            } else
            {
                while (aux.getSig() != r.getSig() && aux.getSig().getEt().compareTo(n.getEt()) < 0)
                {
                    aux = aux.getSig();
                }
                n.setSig(aux.getSig());
                n.setAnt(aux);
                aux.getSig().setAnt(n);
                aux.setSig(n);
            }
        }
    }

    public String desp()
    {
        if (r == null)
        {
            return "Lista vacia";
        }
        String s = "";
        NodoD aux = r.getSig();
        do
        {
            s += aux.getEt() + "\t";
            aux = aux.getSig();
        } while (aux != r.getSig());
        s += "\n";
        aux = r;
        do
        {
            s += aux.getEt() + "\t";
            aux = aux.getAnt();
        } while (aux != r);
        return s;
    }

    public NodoD elimina(String et)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        NodoD aux = r;
        NodoD n = null;
        do
        {
            if (aux.getEt().equals(et))
            {
                n = aux;
                break;
            }
            aux = aux.getSig();
        } while (aux != r);
        if (n == null)
        {
            System.out.println("No existe dato");
            return null;
        }
        if (n == r && r.getSig() == r)
        {
            r = null;
        } else
        {
            n.getAnt().setSig(n.getSig());
            n.getSig().setAnt(n.getAnt());
            if (n == r)
            {
                r = n.getAnt();
            }
        }
        n.setSig(null);
        n.setAnt(null);
        return n;
    }
}
