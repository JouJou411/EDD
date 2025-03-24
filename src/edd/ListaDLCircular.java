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
            n.setSiguiente(n);
            n.setAnterior(n);
        } else
        {
            NodoD aux = r.getSiguiente();
            if (n.getEtiqueta().compareTo(aux.getEtiqueta()) < 0 || n.getEtiqueta().compareTo(r.getEtiqueta()) > 0)
            {
                n.setSiguiente(aux);
                n.setAnterior(r);
                aux.setAnterior(n);
                r.setSiguiente(n);
                if (n.getEtiqueta().compareTo(r.getEtiqueta()) > 0)
                {
                    r = n;
                }
            } else
            {
                while (aux.getSiguiente() != r.getSiguiente() && aux.getSiguiente().getEtiqueta().compareTo(n.getEtiqueta()) < 0)
                {
                    aux = aux.getSiguiente();
                }
                n.setSiguiente(aux.getSiguiente());
                n.setAnterior(aux);
                aux.getSiguiente().setAnterior(n);
                aux.setSiguiente(n);
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
        NodoD aux = r.getSiguiente();
        do
        {
            s += aux.getEtiqueta() + "\t";
            aux = aux.getSiguiente();
        } while (aux != r.getSiguiente());
        s += "\n";
        aux = r;
        do
        {
            s += aux.getEtiqueta() + "\t";
            aux = aux.getAnterior();
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
            if (aux.getEtiqueta().equals(et))
            {
                n = aux;
                break;
            }
            aux = aux.getSiguiente();
        } while (aux != r);
        if (n == null)
        {
            System.out.println("No existe dato");
            return null;
        }
        if (n == r && r.getSiguiente() == r)
        {
            r = null;
        } else
        {
            n.getAnterior().setSiguiente(n.getSiguiente());
            n.getSiguiente().setAnterior(n.getAnterior());
            if (n == r)
            {
                r = n.getAnterior();
            }
        }
        n.setSiguiente(null);
        n.setAnterior(null);
        return n;
    }
}
