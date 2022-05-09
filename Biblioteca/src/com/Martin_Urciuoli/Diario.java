package com.Martin_Urciuoli;

public class Diario extends Prensa {

    public Diario(int codigo, int añoEjemplar, String titular) {
        super(codigo, añoEjemplar, titular);
    }

    public void leerLibro() {
        super.setStatus(STATUS.EN_SALON);
    }


    @Override
    public String toString() {
        return "Diario{" + super.toString() + "}";
    }
}
