/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class MultiLista
{

    private NodoML r = null;

    public NodoML getR()
    {
        return r;
    }

    public void setR(NodoML r)
    {
        this.r = r;
    }

    public NodoML inserta(NodoML obj, NodoML r, String[] s, int nivel)
    {
        if (nivel == s.length - 1)
        {
            ListaSLML l = new ListaSLML();
            l.setR(r);
            l.inserta(obj);
            return l.getR();
        } else
        {
            NodoML aux = busca(r, s[nivel]);
            if (aux != null)
            {
                aux.setAbajo(inserta(obj, aux.getAbajo(), s, nivel + 1));
            }
            return r;
        }
    }

    private NodoML busca(NodoML aux, String s)
    {
        while (aux != null)
        {
            if (aux.getEt().equals(s))
            {
                return aux;
            } else
            {
                aux = aux.getSig();
            }
        }
        return null;
    }

    public String desp(NodoML r, String t)
    {
        String s = "";
        while (r != null)
        {
            s += t + r.getEt() + "\n" + desp(r.getAbajo(), t + "\t");
            r = r.getSig();
        }
        return s;
    }

    public NodoML[] elimina(NodoML r, String[] s, int nivel)
    {
        NodoML[] resultado = new NodoML[2];
        if (r == null)
        {
            return resultado;
        } else
        {
            if (nivel == s.length - 1)
            {
                ListaSLML l = new ListaSLML();
                l.setR(r);
                NodoML eliminado = l.elimina(new NodoML(null, s[nivel]));
                resultado[0] = eliminado;
                resultado[1] = l.getR();
                return resultado;
            } else
            {
                NodoML aux = busca(r, s[nivel]);
                if (aux != null)
                {
                    NodoML[] resAbajo = elimina(aux.getAbajo(), s, nivel + 1);
                    aux.setAbajo(resAbajo[1]);
                    resultado[0] = resAbajo[0];
                }
                resultado[1] = r;
            }
            return resultado;
        }
    }
}
