import java.util.Scanner;

public class Main {
    private String nombre;
    private int numeroEmpleado;

    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese el número de empleado:");
        this.numeroEmpleado = scanner.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Número de empleado: " + this.numeroEmpleado);
    }

    public static void main(String[] args) {
        Main empleado = new Main();

        empleado.leerDatos();

        empleado.verDatos();
    }
}
