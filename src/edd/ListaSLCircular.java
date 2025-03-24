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
            n.setSiguiente(n);
        } else
        {
            if (n.getEtiqueta().compareTo(r.getSiguiente().getEtiqueta()) < 0 || n.getEtiqueta().compareTo(r.getEtiqueta()) > 0)
            {
                n.setSiguiente(r.getSiguiente());
                r.setSiguiente(n);
                if (n.getEtiqueta().compareTo(r.getEtiqueta()) > 0)
                {
                    r = n;
                }
            } else
            {
                Nodo aux = r.getSiguiente();
                while (aux.getSiguiente().getEtiqueta().compareTo(n.getEtiqueta()) < 0)
                {
                    aux = aux.getSiguiente();
                }
                n.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(n);
            }
        }
    }

    public String desp()
    {
        if (r != null)
        {
            String s = "";
            Nodo aux = r.getSiguiente();
            while (aux != r)
            {
                s += aux.getEtiqueta() + "\t";
                aux = aux.getSiguiente();
            }
            return s += r.getEtiqueta();
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
            if (r.getSiguiente().getEtiqueta().compareTo(et) > 0 || r.getEtiqueta().compareTo(et) < 0)
            {
                System.out.println("No existe dato");
            } else
            {
                Nodo n;
                if (r.getSiguiente().getEtiqueta().equals(et))
                {
                    n = r.getSiguiente();
                    r.setSiguiente(n.getSiguiente());
                    n.setSiguiente(null);
                    return n;
                } else
                {
                    Nodo aux = r.getSiguiente();
                    while (aux != r)
                    {
                        if (aux.getSiguiente().getEtiqueta().equals(et))
                        {
                            n = r.getSiguiente();
                            r.setSiguiente(n.getSiguiente());
                            n.setSiguiente(null);
                            return n;
                        } else {
                            aux = aux.getSiguiente();
                        }
                    }
                }
            }
        }
        return null;
    }
}
