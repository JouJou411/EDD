/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class NodoML<T>
{

    private T obj;
    private String etiqueta;
    private NodoML siguiente, anterior, arriba, abajo;
//    private NodoML 
    

    public NodoML(T obj, String etiqueta)
    {
        this.obj = obj;
        this.etiqueta = etiqueta;
    }

    public NodoML()
    {
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

    public NodoML getSig()
    {
        return siguiente;
    }

    public void setSiguiente(NodoML siguiente)
    {
        this.siguiente = siguiente;
    }

    public NodoML getAnterior()
    {
        return anterior;
    }

    public void setAnterior(NodoML anterior)
    {
        this.anterior = anterior;
    }

    public NodoML getArriba()
    {
        return arriba;
    }

    public void setArriba(NodoML arriba)
    {
        this.arriba = arriba;
    }

    public NodoML getAbajo()
    {
        return abajo;
    }

    public void setAbajo(NodoML abajo)
    {
        this.abajo = abajo;
    }

}
