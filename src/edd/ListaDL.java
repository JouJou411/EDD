/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ListaDL
{

    private NodoD r;

    public ListaDL(NodoD r)
    {
        this.r = r;
    }

    public ListaDL()
    {
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
        if (n == null)
        {
            System.out.println("No se puede insertar un nodo nulo.");
        } else
        {
            if (r == null)
            {
                r = n;
            } else
            {
                if (r.getEtiqueta().compareTo(n.getEtiqueta()) > 0)
                {
                    n.setSiguiente(r);
                    r.setAnterior(n);
                    r = n;
                } else
                {
                    NodoD aux = r;
                    while (aux.getSiguiente() != null)
                    {
                        if (aux.getSiguiente().getEtiqueta().compareTo(n.getEtiqueta()) > 0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            n.setAnterior(aux);
                            aux.getSiguiente().setAnterior(n);
                            aux.setSiguiente(n);
                            return;
                        }
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(n);
                    n.setAnterior(aux);
                }
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
        NodoD aux = r;
        while (aux != null)
        {
            s += aux.getEtiqueta() + "\t";
            if (aux.getSiguiente() == null)
            {
                break;
            } else
            {
                aux = aux.getSiguiente();
            }
        }
        s += "\n";
        while (aux != null)
        {
            s += aux.getEtiqueta() + "\t";
            aux = aux.getAnterior();
        }
        return s;
    }

    public String despRecursivo(NodoD aux, String s)
    {
        if (aux != null)
        {
            s += aux.getEtiqueta() + "\t" + despRecursivo(aux.getSiguiente(), s);
        }
        return s;
    }

    public NodoD elimina(String et)
    {
        if (r == null || r.getEtiqueta().compareTo(et) > 0)
        {
            return null;
        }
        NodoD eliminado = null;
        if (r.getEtiqueta().compareTo(et) == 0)
        {
            eliminado = r;
            r = r.getSiguiente();
            if (r != null)
            {
                r.setAnterior(null);
            }
            return eliminado;
        }
        NodoD aux = r;
        while (aux.getSiguiente() != null)
        {
            if (aux.getSiguiente().getEtiqueta().compareTo(et) == 0)
            {
                eliminado = aux.getSiguiente();
                aux.setSiguiente(eliminado.getSiguiente());
                if (eliminado.getSiguiente() != null)
                {
                    eliminado.getSiguiente().setAnterior(aux);
                }
                eliminado.setAnterior(null);
                eliminado.setSiguiente(null);
                return eliminado;
            }
            aux = aux.getSiguiente();
        }
        return eliminado;
    }
}
