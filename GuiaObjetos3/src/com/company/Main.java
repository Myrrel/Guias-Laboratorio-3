package com.company;

import Ejercicio1.Cilindro;

import java.util.Locale;

public class Main {
    static void ejer1(){
        /*
        Inicializar un Cilindro y debuguear analizando los constructores a los que
        va llamando para inicializar la cadena de herencia. Imprimir por pantalla,
        el radio del cilindro, la altura, el área de la base y el volumen.
        * */
        Cilindro cilindro = new Cilindro();
        System.out.println("=======================================");
        System.out.println("= Radio del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro.getRadio()));
        System.out.println("= Altura del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro.getAltura()));
        System.out.println("= Area del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro.getArea()));
        System.out.println("= Volumen del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro.getVolumen()));
        System.out.println("=======================================");
        System.out.println();

    /*
        Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        Imprimir por pantalla el radio, la altura, el área de la base y el volumen.
    */
        Cilindro cilindro2 = new Cilindro(3,5);
        System.out.println("=======================================");
        System.out.println("= Radio del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getRadio()));
        System.out.println("= Altura del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getAltura()));
        System.out.println("= Area del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getArea()));
        System.out.println("= Volumen del Cilindro  " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getVolumen()));
        System.out.println("=======================================");

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
        System.out.println("= Radio del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getRadio()));
        System.out.println("= Altura del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getAltura()));
        System.out.println("= Area de la base del Cilindro " + String.format(
                Locale.GERMAN,
                "%,.2f",
                cilindro2.getAreaBase()
        ));
        System.out.println("= Area del Cilindro " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getArea()));
        System.out.println("= Volumen del Cilindro  " + String.format(Locale.GERMAN,"%,.2f" ,cilindro2.getVolumen()));
        System.out.println("=======================================");

    /*
        Modificar el método toString() de la clase cilindro para que imprima por pantalla lo siguiente
                Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};
    */
        System.out.println(cilindro2);

    }

    static void ejer2(){

    }

    static void ejer3(){

    }

    public static void main(String[] args) {
        //ejer1();
        ejer2();
    }
}
