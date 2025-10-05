public class E_Horas extends Empresa{
    private double Salario_h= 98000;
    private int Horas_t;

    public E_Horas(String nombre, int edad, int salarioH, int horas_t) {
    }

    public E_Horas(String nombre, String edad, double salario_h, int horas_t) {
        super(nombre, edad);
        this.Salario_h = salario_h;
        this.Horas_t = horas_t;
    }
    public double Calcular_H() {
        return Salario_h * Horas_t;
    }

    public double getSalario_h() {
        return Salario_h;
    }

    public void setSalario_h(double salario_h) {
        Salario_h = salario_h;
    }

    public int getHoras_t() {
        return Horas_t;
    }

    public void setHoras_t(int horas_t) {
        Horas_t = horas_t;
    }

    @Override
    public String toString() {
        return super.toString()+"E_Horas{" +
                "Salario_h=" + Salario_h +
                ", Horas_t=" + Horas_t +
                ", Calcular_H=" + Calcular_H() +
                '}';
    }

    @Override
    public String mostrarInfo() {
        return "Los empleados por horas son: \n"+"--Nombre: "+Nombre+" --Edad: "+Edad+" --Salario por hora: "+Salario_h+" --Horas de trabajo: "+Horas_t+" --Salario: "+Calcular_H();
    }
}
