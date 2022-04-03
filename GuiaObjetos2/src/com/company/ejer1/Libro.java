package com.company.ejer1;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor [] autor;

    public Libro(String titulo, double precio, int stock, Autor[] autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public String getPublicity(){
        String msg = "\n \t El libro, " + titulo + " de" + getAutorString() + "se vende a " + precio + " pesos.";
        return msg;
    }

    public String getAutorString() {
        String msg = " ";
        for (int i = 0; i < autor.length; i++) {
            if (autor[i] != null) {
                msg = msg + autor[i].getNombre() + " " + autor[i].getApellido() + ", " ;
            }
        }
        return msg;
    }

    @Override
    public String toString() {
        return "\nLibro: [ "
                + "\n \t \"" + titulo + "\","
                + "\n \t" + getAutorString()
                + "\n \t $" + String.format("%.2f",precio) + ", "
                + "\n \t " +  ((stock > 1) ? stock  + " unidades " : stock  + " unidad")
                + "\n]";
    }
}
