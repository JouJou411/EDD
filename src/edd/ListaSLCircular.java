/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ListaSLCircular
{

    private Nodo r;

    public ListaSLCircular()
    {
    }

    public ListaSLCircular(Nodo r)
    {
        this.r = r;
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
        if (r == null)
        {
            r = n;
            n.setSig(n);
        } else
        {
            if (n.getEt().compareTo(r.getSig().getEt()) < 0 || n.getEt().compareTo(r.getEt()) > 0)
            {
                n.setSig(r.getSig());
                r.setSig(n);
                if (n.getEt().compareTo(r.getEt()) > 0)
                {
                    r = n;
                }
            } else
            {
                Nodo aux = r.getSig();
                while (aux.getSig().getEt().compareTo(n.getEt()) < 0)
                {
                    aux = aux.getSig();
                }
                n.setSig(aux.getSig());
                aux.setSig(n);
            }
        }
    }

    public String desp()
    {
        if (r != null)
        {
            String s = "";
            Nodo aux = r.getSig();
            while (aux != r)
            {
                s += aux.getEt() + "\t";
                aux = aux.getSig();
            }
            return s += r.getEt();
        } else
        {
            return "Lista vacia";
        }

    }

    public Nodo elimina(String et)
    {
        if (r == null)
        {
            System.out.println("Lita vacia");
        } else
        {
            if (r.getSig().getEt().compareTo(et) > 0 || r.getEt().compareTo(et) < 0)
            {
                System.out.println("No existe dato");
            } else
            {
                Nodo n;
                if (r.getSig().getEt().equals(et))
                {
                    n = r.getSig();
                    r.setSig(n.getSig());
                    n.setSig(null);
                    return n;
                } else
                {
                    Nodo aux = r.getSig();
                    while (aux != r)
                    {
                        if (aux.getSig().getEt().equals(et))
                        {
                            n = r.getSig();
                            r.setSig(n.getSig());
                            n.setSig(null);
                            return n;
                        } else {
                            aux = aux.getSig();
                        }
                    }
                }
            }
        }
        return null;
    }
}
