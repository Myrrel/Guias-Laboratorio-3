package Ejercicio2;

public class Estudiante extends  Persona {
    private String carrera;
    private double añoIngreso, cuotaMensual;

    public Estudiante(
            String dni,
            String nombre,
            String apellido,
            String email,
            String direccion,
            String carrera,
            double añoIngreso,
            double cuotaMensual
    ) {
        super(dni, nombre, apellido, email, direccion);
        this.carrera = carrera;
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(double añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
}
