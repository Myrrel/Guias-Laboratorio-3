package Ejercicio2;

public class MiembroStaff extends Persona {
    public enum Turno {
        MANIANA,TARDE,NOCHE
    }
    private double salario;
    private Turno turno = Turno.NOCHE;
    

    public MiembroStaff(String dni, String nombre, String apellido, String email, String direccion, double salario, Turno turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
