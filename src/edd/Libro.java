/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Jou
 */
public class Libro
{

    private String titulo;
    private String autor;
    private String editorial;
    private int numPaginas;
    private String idioma;
    private String fechaPublicacion;
    private long isbn;
    private String edicion;
    private String formato;
    private String coleccion;
    private String tematica;

    public Libro()
    {
    }

    public Libro(String titulo, String autor, String editorial, int numPaginas, String idioma, String fechaPublicacion, long isbn, String edicion, String formato, String coleccion, String tematica)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.idioma = idioma;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.edicion = edicion;
        this.formato = formato;
        this.coleccion = coleccion;
        this.tematica = tematica;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public int getNumPaginas()
    {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas)
    {
        this.numPaginas = numPaginas;
    }

    public String getIdioma()
    {
        return idioma;
    }

    public void setIdioma(String idioma)
    {
        this.idioma = idioma;
    }

    public String getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    public long getIsbn()
    {
        return isbn;
    }

    public void setIsbn(long isbn)
    {
        this.isbn = isbn;
    }

    public String getEdicion()
    {
        return edicion;
    }

    public void setEdicion(String edicion)
    {
        this.edicion = edicion;
    }

    public String getFormato()
    {
        return formato;
    }

    public void setFormato(String formato)
    {
        this.formato = formato;
    }

    public String getColeccion()
    {
        return coleccion;
    }

    public void setColeccion(String coleccion)
    {
        this.coleccion = coleccion;
    }

    public String getTematica()
    {
        return tematica;
    }

    public void setTematica(String tematica)
    {
        this.tematica = tematica;
    }

    @Override
    public String toString()
    {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", numPaginas=" + numPaginas + ", idioma=" + idioma + ", fechaPublicacion=" + fechaPublicacion + ", isbn=" + isbn + ", edicion=" + edicion + ", formato=" + formato + ", coleccion=" + coleccion + ", tematica=" + tematica + '}';
    }

}
