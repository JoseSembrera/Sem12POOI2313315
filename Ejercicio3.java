public class Main {
    private String nombre;
    private double salario;
    private int numeroEmpleado;

    public Main(String nombre, double salario, int numeroEmpleado) {
        this.nombre = nombre;
        this.salario = salario;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public static void main(String[] args) {
        Main[] empleados = new Main[50];

        for (int i = 0; i < 50; i++) {
            String nombre = "Empleado " + (i + 1);
            double salario = 25000 + i * 1000;
            int numeroEmpleado = 1001 + i;
            empleados[i] = new Main(nombre, salario, numeroEmpleado);
        }

        for (Main empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println("Número de empleado: " + empleado.getNumeroEmpleado());
            System.out.println();
        }
    }
}

