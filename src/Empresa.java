public abstract class Empresa {
    protected String Nombre;
    protected  String Edad;

    public Empresa() {
    }

    public Empresa(String nombre, String edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad='" + Edad + '\'' +
                '}';
    }

    public String mostrarInfo(){
        return "--Nombre: "+Nombre+" --Edad: "+Edad;
    }

}
