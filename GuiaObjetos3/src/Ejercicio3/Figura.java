package Ejercicio3;

public abstract class Figura {
    private String color = "rojo";
    public abstract double getPerimetro();
    public abstract double getArea();

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
