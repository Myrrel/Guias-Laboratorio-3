package com.company;

import Ejercicio1.Cilindro;

import Ejercicio2.Estudiante;
import Ejercicio2.MiembroStaff;
import Ejercicio2.Persona;
import Ejercicio3.Circulo;
import Ejercicio3.Cuadrado;
import Ejercicio3.Rectangulo;
import java.util.Locale;

import static Ejercicio2.MiembroStaff.Turno;

public class Main {
    static void printFormat(String msg, double num){
        System.out.println(msg + " " + String.format(Locale.GERMANY,"%,.2f",num));
    }
    static void ejer1(){
        /*
        Inicializar un Cilindro y debuguear analizando los constructores a los que
        va llamando para inicializar la cadena de herencia. Imprimir por pantalla,
        el radio del cilindro, la altura, el área de la base y el volumen.
        * */
        Cilindro cilindro = new Cilindro();
        System.out.println("=======================================");
        printFormat("= Radio del Cilindro ",cilindro.getRadio());
        printFormat("= Altura del Cilindro  ",cilindro.getAltura());
        printFormat("= Area del Cilindro ",cilindro.getArea());
        printFormat("= Volumen del Cilindro  ",cilindro.getVolumen());
        System.out.println("=======================================");
        System.out.println();

    /*
        Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
    */
        Cilindro cilindro2 = new Cilindro(3,5);
        System.out.println("=======================================");
        printFormat("= Radio del Cilindro ",cilindro2.getRadio());
        printFormat("= Altura del Cilindro ",cilindro2.getAltura());
        printFormat("= Area del Cilindro ",cilindro2.getArea());
        printFormat("= Volumen del Cilindro ",cilindro2.getVolumen());
        System.out.println("=======================================");
        System.out.println();

    /*
        Sobreescribir el método calcular area declarado en Círculo, para que nos permita calcular el área del
        cilindro.
                        (2π×radius×height + 2×areaBase)
        Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el
        cálculo del volumen difiere, esto es porque nosotros sobreescribimos el método calcular area y ahora nos
        calcula el área de un cilindro. Modificar el método calcular volumen en la clase cilindro para que llame
        al método de la clase que calcula el área.
    */

        System.out.println("=======================================");
        printFormat("= Radio del Cilindro ",cilindro2.getRadio());
        printFormat("= Altura del Cilindro ",cilindro2.getAltura());
        printFormat("= Area de la base del Cilindro ",cilindro2.getAreaBase());
        printFormat("= Area del Cilindro ",cilindro2.getArea());
        printFormat("= Volumen del Cilindro ",cilindro2.getVolumen());
        System.out.println("=======================================");
        System.out.println();

    /*
        Modificar el método toString() de la clase cilindro para que imprima por pantalla lo siguiente
                Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};
    */
        System.out.println(cilindro2);

    }

    static void ejer2(){
        /*
            Inicializar 4 estudiantes diferentes.
        */
        Persona[] listado = new Persona[8];

        for (int i = 0; i < 4; i++) {
            listado[i] = new Estudiante(
                    "23456789",
                    "Perez" + i,
                    "Carlos" + i,
                    "carlos@gmail.com" + i,
                    "direccion 2345" + i,
                    "Lic Historia",
                    2020,
                    5000
            );
        }

        /*
            Inicializar 4 miembros de staff con características diferentes.
            Crear un array que permita almacenar juntos los tipos anteriores y
            almacenar las 8 instancias creadas anteriormente.
        */

        for (int i = 4; i < listado.length; i++) {
            listado[i] = new MiembroStaff(
                    "23456789",
                    "Perez" + i,
                    "Carlos" + i,
                    "carlos@gmail.com" + i,
                    "direccion 2345 " + i,
                    23000,
                     (i % 2 == 0) ? Turno.NOCHE : Turno.MANIANA
            );
        }

        /*
            Investigar el uso de la palabra reservada instanceof.
            Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
            la cantidad de miembros de staff.
            Recorrer el array y sumar el total de ingresos que percibe la
            institución por parte de la cuota de estudiantes.
        */

        double totalIngresosPorCuotas = 0;
        double cantEstudiantes = 0;
        double cantMiembrosStaff = 0;

        for (int i = 0; i < listado.length ; i++) {

            if (listado[i] instanceof Estudiante) {
                cantEstudiantes += 1;
                totalIngresosPorCuotas += ((Estudiante) listado[i]).getCuotaMensual();
            } else {
                cantMiembrosStaff += 1;
            }
        }

        printFormat("totalIngresosPorCuotas: ",totalIngresosPorCuotas);
        printFormat("cant Estudiantes: ",cantEstudiantes);
        printFormat("cant Miembros Staff: ",cantMiembrosStaff);
    }

    static void ejer3(){

        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(2,4);
        Cuadrado cuadrado = new Cuadrado(5);

        printFormat("Circulo Area ",circulo.getArea());
        printFormat("Circulo Perimetro ",circulo.getPerimetro());

        printFormat("Rectangulo Area ",rectangulo.getArea());
        printFormat("Rectangulo Area ",rectangulo.getPerimetro());

        printFormat("Cuadrado Area ",cuadrado.getArea());
        printFormat("Cuadrado Perimetro ",cuadrado.getPerimetro());
    }

    public static void main(String[] args) {
        //ejer1();
        //ejer2();
        ejer3();
    }
}
