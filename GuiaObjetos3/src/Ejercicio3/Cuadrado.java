package Ejercicio3;

public class Cuadrado extends Rectangulo{
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public Cuadrado(double base, double altura) {
        super(base, altura);
    }

    public Cuadrado(String color, double base, double altura) {
        super(color, base, altura);
    }
}
