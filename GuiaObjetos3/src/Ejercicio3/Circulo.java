package Ejercicio3;

public class Circulo extends Figura{
    private double radio = 1.0;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(String color) {
        super(color);
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getPerimetro() {
        return Math.PI * radio * 2;
    }

    @Override
    public double getArea() {
        return  Math.PI * radio * radio;
    }
}
