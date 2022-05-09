package com.Martin_Urciuoli;

public class Libro extends Ejemplar implements SePuedenAlquilar {
        private String titulo;
        private GENERO genero;


        public Libro(int codigo, int añoEjemplar, String titulo, GENERO genero) {
                super(codigo, añoEjemplar);
                this.titulo = titulo;
                this.genero = genero;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public GENERO getGenero() {
                return genero;
        }

        public void setGenero(GENERO genero) {
                this.genero = genero;
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
                return "Libro{" +
                        "titulo='" + titulo + '\'' +
                        ", genero=" + genero + '\'' +
                        ", status=" + super.getStatus() + '\'' +
                        '}';
        }
}
