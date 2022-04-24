package Ejercicio3;

public class Rectangulo extends Figura{
    private double base = 1.0;
    private double altura = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getPerimetro() {
        return (base + altura) * 2;
    }

    @Override
    public double getArea() {
        return base*altura;
    }
}
