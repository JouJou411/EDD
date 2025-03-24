/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class ColaCircular<T> implements Machote<T>
{

    private int a = -1, f = -1;
    private T arr[];

    public ColaCircular(T arr[])
    {
        this.arr = arr;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public T[] getArr()
    {
        return arr;
    }

    public void setArr(T[] arr)
    {
        this.arr = arr;
    }

    public int getF()
    {
        return f;
    }

    public void setF(int f)
    {
        this.f = f;
    }

    @Override
    public void inserta(T obj)
    {
        if (!llena())
        {
            if (a == -1)
            {
                a = f = 0;
            } else
            {
                if (a + 1 == arr.length)
                {
                    a = 0;
                } else
                {
                    a++;
                }
            }
            arr[a] = obj;
        } else
        {
            System.out.println("Colca circular llena");
        }
    }

    @Override
    public T elimina()
    {
        T obj = null;
        if (!vacia())
        {
            obj = arr[f];
            if (f == arr.length - 1)
            {
                f = 0;
            } else
            {
                if (f == a)
                {
                    a = f = -1;
                } else
                {
                    f++;
                }
            }
        } else
        {
            System.out.println("cola vacia");
        }
        return obj;
    }

    @Override
    public boolean llena()
    {
        return (arr.length - 1) == f || (arr.length - 1) == a;
    }

    @Override
    public boolean vacia()
    {
        return a == -1;
    }

}
