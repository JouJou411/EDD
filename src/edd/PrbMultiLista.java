/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Joabp
 */
public class PrbMultiLista
{

    public static void main(String[] args)
    {
        MultiLista m = new MultiLista();
        NodoML n1 = new NodoML("UNAM", "UNAM");
        NodoML n2 = new NodoML("UDG", "UDG");
        NodoML n3 = new NodoML("UAEM", "UAEM");
        NodoML n4 = new NodoML("DER", "DER");
        NodoML n5 = new NodoML("FIL", "FIL");
        NodoML n6 = new NodoML("MED", "MED");
        NodoML n7 = new NodoML("CHE", "CHE");
        NodoML n8 = new NodoML("CON", "CON");
        NodoML n9 = new NodoML("ODO", "ODO");
        NodoML n10 = new NodoML("ISW", "ISW");
        NodoML n11 = new NodoML("IPI", "IPI");
        NodoML n12 = new NodoML("IPL", "IPL");
        NodoML n13 = new NodoML("EDD", "EDD");
        NodoML n14 = new NodoML("PRG", "PRG");

        String s[] =
        {
            "UNAM"
        };
        m.setR(m.inserta(n1, m.getR(), s, 0));
        m.setR(m.inserta(n2, m.getR(), s, 0));
        m.setR(m.inserta(n3, m.getR(), s, 0));
        s = new String[2];
        s[0] = "UNAM";
        m.setR(m.inserta(n4, m.getR(), s, 0));
        m.setR(m.inserta(n5, m.getR(), s, 0));
        m.setR(m.inserta(n6, m.getR(), s, 0));
        s[0] = "UDG";
        m.setR(m.inserta(n7, m.getR(), s, 0));
        m.setR(m.inserta(n8, m.getR(), s, 0));
        m.setR(m.inserta(n9, m.getR(), s, 0));
        s[0] = "UAEM";
        m.setR(m.inserta(n10, m.getR(), s, 0));
        m.setR(m.inserta(n11, m.getR(), s, 0));
        m.setR(m.inserta(n12, m.getR(), s, 0));

        s = new String[3];
        s[0] = "UAEM";
        s[1] = "ISW";

        m.setR(m.inserta(n13, m.getR(), s, 0));
        m.setR(m.inserta(n14, m.getR(), s, 0));

        System.out.println(m.desp(m.getR(), ""));

        s[0] = "UAEM";
        s[1] = "ISW";
        s[2] = "PRG";
        NodoML[] resultado = m.elimina(m.getR(), s, 0);
        if (resultado[0] != null)
        {
            System.out.println("Nodo eliminado: " + resultado[0].getEt());
        } else
        {
            System.out.println("Nodo no encontrado.");
        }
        m.setR(resultado[1]);
        System.out.println(m.desp(m.getR(), ""));

        s = new String[2];
        s[0] = "UAEM";
        s[1] = "ISW";
        resultado = m.elimina(m.getR(), s, 0);
        if (resultado[0] != null)
        {
            System.out.println("Nodo eliminado: " + resultado[0].getEt());
        } else
        {
            System.out.println("Nodo no encontrado.");
        }
        m.setR(resultado[1]);
        System.out.println(m.desp(m.getR(), ""));
    }
}
