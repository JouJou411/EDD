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

        if (r.getEtiqueta().compareTo(n.getEtiqueta()) > 0)
        {
            n.setSiguiente(r);
            r = n;
            return;
        }

        Nodo aux = r;
        while (aux.getSiguiente() != null && aux.getSiguiente().getEtiqueta().compareTo(n.getEtiqueta()) < 0)
        {
            aux = aux.getSiguiente();
        }

        n.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(n);
    }

    public String desp()
    {
        String s = "";
        Nodo aux = r;
        while (aux != null)
        {
            s += aux.getEtiqueta() + "\t";
            aux = aux.getSiguiente();
        }
        return s;
    }

    public String despRecursivo(Nodo aux, String s)
    {
        if (aux != null)
        {
            s += aux.getEtiqueta() + "\t" + despRecursivo(aux.getSiguiente(), s);
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
        if (r.getEtiqueta().compareTo(n.getEtiqueta()) > 0){
            System.out.println("Nodo no encontrado");
            return null;
        }
        Nodo eliminado = null;
        if (r.getEtiqueta().compareTo(n.getEtiqueta()) == 0)
        {
            eliminado = r;
            r = n.getSiguiente();
            eliminado.setSiguiente(null);
            return eliminado;
        }
        Nodo aux = r;
        while (aux.getSiguiente() != null)
        {
            if (aux.getSiguiente().getEtiqueta().compareTo(n.getEtiqueta()) == 0)
            {
                eliminado = aux.getSiguiente();
                aux.setSiguiente(eliminado.getSiguiente());
                eliminado.setSiguiente(null);
                return eliminado;
            }
            aux = aux.getSiguiente();
        }
        return eliminado;
    }
}
