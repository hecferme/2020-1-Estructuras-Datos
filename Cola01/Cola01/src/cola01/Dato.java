package cola01;

public class Dato {

    private String nombre;
    private double salario;

    public Dato() {
        this.nombre = "";
        this.salario = 0.00;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
