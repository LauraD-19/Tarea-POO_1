public class E_Planta extends Empresa{
    private double Salario_f = 2100000;

    public E_Planta(String nombre, int edad, int salarioF) {
    }

    public E_Planta(String nombre, String edad, double salario_f) {
        super(nombre, edad);
        this.Salario_f = salario_f;
    }

    public double getSalario_f() {
        return Salario_f;
    }

    public void setSalario_f(double salario_f) {
        Salario_f = salario_f;
    }

    @Override
    public String toString() {
        return super.toString() + "E_Planta{" +
                "Salario_f=" + Salario_f +
                '}';
    }

    @Override
    public String mostrarInfo() {
        return "Los empleados de Planta son: \n"+"--Nombre: "+Nombre+" --Edad: "+Edad+" --Salario: "+Salario_f;
    }
}
