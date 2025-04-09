/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class NodoArbol<T>
{

    private T obj;
    private NodoArbol der, izq;
    private String et;
    private int altura;

    public NodoArbol()
    {
    }

    public NodoArbol(T obj, String et)
    {
        this.obj = obj;
        this.et = et;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public NodoArbol getDer()
    {
        return der;
    }

    public void setDer(NodoArbol der)
    {
        this.der = der;
    }

    public NodoArbol getIzq()
    {
        return izq;
    }

    public void setIzq(NodoArbol izq)
    {
        this.izq = izq;
    }

    public String getEt()
    {
        return et;
    }

    public void setEt(String et)
    {
        this.et = et;
    }

    public NodoArbol(String et)
    {
        this.et = et;
        this.altura = 1;
    }

}
