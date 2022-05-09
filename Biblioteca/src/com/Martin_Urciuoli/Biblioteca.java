package com.Martin_Urciuoli;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements MensajesError {
    private List<Ejemplar> listado;

    public Biblioteca() {
        listado = new ArrayList<>();
    }

    public void addOne(Ejemplar ejemplar){
        listado.add(ejemplar);
    }

    public Ejemplar findOnebyCode(int codigo) {
        var ejemplar = this.listado.stream().filter(ejemplar1 -> ejemplar1.getCodigo() == codigo ).findFirst().orElse(null);
        return ejemplar;
    }

    public void generarBibliotecaDemo() {
        for (int i = 0; i < 3; i++) {
            GENERO genero = GENERO.values()[i];
            Libro libro = new Libro(123  + i,2013,"Carro " + i, genero );
            this.addOne(libro);
        }
        for (int i = 0; i < 3; i++) {
            Diario diario = new Diario(789  + i,2013,"Clarin " + i);
            this.addOne(diario);
        }
        for (int i = 0; i < 3; i++) {
            Revista revista = new Revista(456 + i,2013,"Revista Viva " + i);
            this.addOne(revista);
        }
    }

    public void alquilarEjemplarPorCodigo(int codigo) {
        Ejemplar ejemplar = findOnebyCode(codigo);

        boolean isDiario = ejemplar instanceof  Diario;

        if (ejemplar == null ) {
            System.out.println(NOT_ + FOUND_);
        } else if(isDiario) {
            System.out.println("Diario "+ NOT_ +AVAIBLE_);
        } else {
            if (ejemplar.getStatus() == STATUS.EN_BIBLIOTECA) {
                ejemplar.setStatus(STATUS.ALQUILADO);
                System.out.println(this);
            } else {
                System.out.println(ejemplar.toString() + NOT_ + AVAIBLE_);
            }
        }
    }

    public void devolverEjemplarPorCodigo(int codigo) {
        Ejemplar ejemplar = findOnebyCode(codigo);

        boolean isDiario = ejemplar instanceof  Diario;

        if (ejemplar == null ) {
            System.out.println(NOT_ + FOUND_);
        } else if(isDiario) {
            System.out.println("Diario "+ NOT_ +AVAIBLE_);
        } else {
            if (ejemplar.getStatus() == STATUS.ALQUILADO) {
                ejemplar.setStatus(STATUS.EN_BIBLIOTECA);
                System.out.println(this);
            } else {
                System.out.println(ejemplar.toString() + IS_ + AVAIBLE_ + FOR_RENT);
            }
        }
    }

    public void permitirLeerDarioPorCodigo(int codigo) {
        Ejemplar ejemplar = findOnebyCode(codigo);

        boolean isDiario = ejemplar instanceof  Diario;

        if (ejemplar == null ) {
            System.out.println(NOT_ + FOUND_);
        } else if(isDiario) {
            if (ejemplar.getStatus() == STATUS.EN_BIBLIOTECA) {
                ejemplar.setStatus(STATUS.EN_SALON);
                System.out.println(this);
            } else {
                System.out.println(ejemplar.toString() + NOT_ + IS_ + AVAIBLE_);
            }
        } else {
            System.out.println( NOT_ +AVAIBLE_);
        }
    }

    public void guardarDiarioPorCodigo(int codigo) {
        Ejemplar ejemplar = findOnebyCode(codigo);

        boolean isDiario = ejemplar instanceof  Diario;

        if (ejemplar == null ) {
            System.out.println(NOT_ + FOUND_);
        } else if(isDiario) {
            if (ejemplar.getStatus() == STATUS.EN_SALON) {
                ejemplar.setStatus(STATUS.EN_BIBLIOTECA);
                System.out.println(this);
            }
        } else {
            System.out.println( NOT_ +AVAIBLE_);
        }
    }

    public void demoBiblioteca() {

        System.out.println(this);

        // 123 al 125 son libros
        // 789 al 791 son diarios
        // 456 al 458 son revistas

        System.out.println("=====Alquilar un libro=====");
        this.alquilarEjemplarPorCodigo (123);

        System.out.println("=====Alquilar un libro alquilado=====");
        this.alquilarEjemplarPorCodigo (123);

        System.out.println("=====Devolver un libro=====");
        this.devolverEjemplarPorCodigo(123);

        System.out.println("=====Devolver una revista devuelta=====");
        this.devolverEjemplarPorCodigo(456);

        System.out.println("=====Leer diario=====");
        this.permitirLeerDarioPorCodigo(789);

        System.out.println("=====Leer diario no disponible=====");
        this.permitirLeerDarioPorCodigo(789);

        System.out.println("=====guardar diario=====");
        this.guardarDiarioPorCodigo(789);

    }

    @Override
    public String toString() {
        return "Biblioteca: " + listado;
    }
}
