package com.Martin_Urciuoli;

public abstract class Ejemplar {
    private int codigo;
    private int añoEjemplar;
    private STATUS status = STATUS.EN_BIBLIOTECA;

    public Ejemplar(int codigo, int añoEjemplar) {
        this.codigo = codigo;
        this.añoEjemplar = añoEjemplar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAñoEjemplar() {
        return añoEjemplar;
    }

    public void setAñoEjemplar(int añoEjemplar) {
        this.añoEjemplar = añoEjemplar;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", añoEjemplar=" + añoEjemplar +
                '}';
    }
}
