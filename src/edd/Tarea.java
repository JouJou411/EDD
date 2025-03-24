/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import edd.Pilas;
import edd.Colas;

/**
 *
 * @author Jou
 */
public class Tarea
{

    /*public static Character sufijoAPrefijo(Character sufijo[])
    {
        Pilas<Character> pila = new Pilas<>(sufijo);
        for (Character token : sufijo)
        { // Dividir la expresión en tokens
            if (esOperador(token))
            { // Verificar si el token es un operador
                Character operando2 = pila.elimina(); // Obtener el segundo operando
                Character operando1 = pila.elimina(); // Obtener el primer operando
                String resultado = token + operando1 + operando2; // Construir la expresión prefija
                pila.inserta(resultado); // Insertar el resultado en la pila
            } else
            {
                pila.inserta(token); // Insertar el operando en la pila
            }
        }
        return pila.elimina(); // El resultado final está en la cima de la pila
    }

    private static boolean esOperador(String token)
    {
        return "()+-*'/'^".contains(token); // Verificar si el token es un operador válido
    }*/
 /*public Character[] sufijoAPrefijo(Character sufijo[])
    {
        Colas<Character> cola = new Colas<>(sufijo.clone());
        Pilas<Character> pila = new Pilas<>(sufijo.clone());
        for (char c : sufijo)
        {
            if (Character.isLetterOrDigit(c))
            {
                cola.inserta(c);
            } else
            {
                switch (c)
                {
                    case '(' ->
                    {
                        if (!pila.vacia())
                        {
                            Pilas<Character> aux = new Pilas<>(sufijo.clone());
                            while (!pila.vacia())
                            {
                                aux.inserta(pila.elimina());
                            }
                            pila.inserta(c);
                            while (!aux.vacia())
                            {
                                pila.inserta(aux.elimina());
                            }
                        } else
                        {
                            pila.inserta(c);
                        }
                    }
                    case ')' ->
                    {
                        if (!pila.vacia())
                        {
                            Pilas<Character> aux = new Pilas<>(sufijo.clone());
                            while (!pila.vacia())
                            {
                                char cAux = pila.elimina();
                                if (cAux == '(' || cAux == ')')
                                {
                                    pila.inserta(cAux);
                                    pila.inserta(c);
                                    break;
                                } else
                                {
                                    aux.inserta(cAux);
                                }
                            }
                            while (!aux.vacia())
                            {
                                pila.inserta(aux.elimina());
                            }
                        } else
                        {
                            pila.inserta(c);
                        }
                    }
                    case '*', '/' ->
                    {
                        if (!pila.vacia())
                        {
                            Pilas<Character> aux = new Pilas<>(sufijo.clone());
                            while (!pila.vacia())
                            {
                                char cAux = pila.elimina();
                                if (cAux == '*' || cAux == '/')
                                {
                                    pila.inserta(cAux);
                                    pila.inserta(c);
                                    break;
                                } else
                                {
                                    aux.inserta(c);
                                    aux.inserta(cAux);
                                }
                            }
                            while (!aux.vacia())
                            {
                                pila.inserta(aux.elimina());
                            }
                        } else
                        {
                            pila.inserta(c);
                        }
                    }
                    case '+', '-' ->
                    {
                        if (!pila.vacia())
                        {
                            Pilas<Character> aux = new Pilas<>(sufijo.clone());
                            while (!pila.vacia())
                            {
                                char cAux = pila.elimina();
                                if (cAux == '+' || cAux == '-')
                                {
                                    pila.inserta(cAux);
                                    pila.inserta(c);
                                    break;
                                } else
                                {
                                    aux.inserta(c);
                                    aux.inserta(cAux);
                                }
                            }
                            while (!aux.vacia())
                            {
                                pila.inserta(aux.elimina());
                            }
                        } else
                        {
                            pila.inserta(c);
                        }
                    }
                }
            }
        }
        while(!cola.vacia()){
            pila.inserta(cola.elimina());
        }
        while(!pila.vacia()){
            System.out.println(pila.elimina());
        }
        return sufijo;
    }*/
    public Character[] sufijoAPrefijo(Character sufijo[])
    {
        Colas<Character> cola = new Colas<>(sufijo.clone());
        Pilas<Character> pila = new Pilas<>(sufijo.clone());

        for (char c : sufijo)
        {
            if (Character.isLetterOrDigit(c))
            {
                cola.inserta(c);
            } else
            {
                while (!pila.vacia() && operador(pila.cima()) >= operador(c))
                {
                    cola.inserta(pila.elimina());
                }
                pila.inserta(c);
            }
        }

        while (!pila.vacia())
        {
            cola.inserta(pila.elimina());
        }

        Character[] resultado = new Character[cola.getArr().length];
        for (int i = 0; i < resultado.length; i++)
        {
            resultado[i] = cola.elimina();
        }

        return resultado;
    }

    private int operador(char operador)
    {
        return switch (operador)
        {
            case '+', '-' ->
                1;
            case '*', '/' ->
                2;
            case '(',')' ->
                0;
            default ->
                -1;
        };
    }

}
