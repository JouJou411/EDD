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

    public String getEt()
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

    public NodoD getSig()
    {
        return siguiente;
    }

    public void setSig(NodoD siguiente)
    {
        this.siguiente = siguiente;
    }

    public NodoD getAnt()
    {
        return anterior;
    }

    public void setAnt(NodoD anterior)
    {
        this.anterior = anterior;
    }

}
