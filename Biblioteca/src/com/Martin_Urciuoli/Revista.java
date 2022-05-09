package com.Martin_Urciuoli;

public class Revista extends Prensa implements SePuedenAlquilar{

    public Revista(int codigo, int añoEjemplar, String titular) {
        super(codigo, añoEjemplar, titular);
    }
    @Override
    public void alquilar() {
        super.setStatus(STATUS.ALQUILADO);
    }

    @Override
    public void devolver() {
        super.setStatus(STATUS.EN_BIBLIOTECA);

    }

    @Override
    public boolean alquilado() {
        return super.getStatus() == STATUS.ALQUILADO;
    }

    @Override
    public String toString() {
        return "Revista{" + super.toString() + "}";

    }
}
