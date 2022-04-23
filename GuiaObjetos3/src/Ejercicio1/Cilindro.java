package Ejercicio1;

public class Cilindro extends Circulo{
    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return super.getArea() * altura;
    }


    public double getAreaBase() {
        return super.getArea();
    }


    @Override
    public double getArea() {
        return  (2 * Math.PI * altura) + super.getArea();
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de + {" + super.toString() + "} +altura= {" + altura +"}";
    }
}
