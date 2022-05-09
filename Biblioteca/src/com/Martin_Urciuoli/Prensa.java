package com.Martin_Urciuoli;

public abstract class Prensa extends Ejemplar {
    private String titular;

    public Prensa(int codigo, int añoEjemplar, String titular) {
        super(codigo, añoEjemplar);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "{" +
                "titular='" + titular + "\' " +
                super.getStatus() +
                '}';
    }
}
