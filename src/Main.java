import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empresa>EmpresaList = new ArrayList<>();
        int op;
        System.out.println("Bienvenido  (•◡•) / \n"+"Por favor eliga una de las siguientes opciones:\n");
        do {
            System.out.println("Menú: \n");
            System.out.println("1. Registar un nuevo trabajador \n"+"2. Lista de empleados registrados \n"+"3. Salir");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    registro_empleados(teclado, EmpresaList);
                    break;
                case 2:
                    list_em(teclado, EmpresaList);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");

            }

        }while (op!=3);

    }

    private static void registro_empleados(Scanner teclado, List<Empresa>EmpresaList){
        System.out.println("Diligencie los siguientes datos: \n");
        teclado.nextLine();
        System.out.println("Ingrese el nombre completo del trabajador:");
        String Nombre= teclado.nextLine();
        System.out.println("Ingrese la edad del trabajador");
        String Edad= teclado.nextLine();

        System.out.println("Que tipo de empleado va a registrar? Seleccione: \n 1. Para trabajadores de planta \n 2. Para trabajadores por horas");
        int op_empleado=teclado.nextInt();
        if (op_empleado ==1){//planta
            Empresa em_planta= new E_Planta(Nombre, Edad, 2100000);
            EmpresaList.add(em_planta);
            System.out.println("Trabajador registrado...");

        }else if (op_empleado==2){
                System.out.println("Digite las horas trabajadas por el trabajador:");
                int horas_t= teclado.nextInt();

                Empresa em_horas = new E_Horas(Nombre, Edad, 98000, horas_t);
                EmpresaList.add(em_horas);
                System.out.println("Trabajador registrado...");

        }else{
                System.out.println("Eliga una opcion correcta (ㆆ_ㆆ)");
                return ;
            }
    }

    private static void list_em (Scanner teclado, List<Empresa>EmpresaList){
        System.out.println("--Lista de empleados registrados: \n");
        for (Empresa E : EmpresaList){
            System.out.println(E.mostrarInfo());
        }
    }
}