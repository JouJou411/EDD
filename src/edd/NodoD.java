/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class NodoD<T>
{

    private T obj;
    private String etiqueta;
    private NodoD siguiente;
    private NodoD anterior;

    public NodoD(T obj, String etiqueta)
    {
        this.obj = obj;
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public NodoD getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(NodoD siguiente)
    {
        this.siguiente = siguiente;
    }

    public NodoD getAnterior()
    {
        return anterior;
    }

    public void setAnterior(NodoD anterior)
    {
        this.anterior = anterior;
    }

}
