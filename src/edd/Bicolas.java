/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class Bicolas<T>
{

    private int a1 = -1, a2;
    private T arr[];

    public Bicolas(T arr[])
    {
        this.arr = arr;
        a2 = arr.length;
    }

    public int getA1()
    {
        return a1;
    }

    public void setA1(int a1)
    {
        this.a1 = a1;
    }

    public T[] getArr()
    {
        return arr;
    }

    public void setArr(T[] arr)
    {
        this.arr = arr;
    }

    public int getA2()
    {
        return a2;
    }

    public void setA2(int a2)
    {
        this.a2 = a2;
    }

    public int inserta(T obj, int a, int lim, int factor)
    {
        if (a + factor == lim)
        {
            System.out.println("Bicola llena");
        } else
        {
            arr[a + factor] = obj;
        }
        return a + factor;
    }

    public Object[] elimina(int a, int lim, int factor)
    {
        Object de[] = new Object[2];
        if (a == lim)
        {
            System.out.println("Bicola vacia");
            de[1] = a;
        } else
        {
            de[0] = arr[lim + factor];
            for (int i = lim + factor; i != a; i += factor)
            {
                arr[i] = arr[i + factor];
            }
            de[1] = a - factor;
        }
        return de;
    }
}
