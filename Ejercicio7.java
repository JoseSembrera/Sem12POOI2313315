public class Empleado {

    public void darDeAlta() {
        System.out.println("Empleado dado de alta.");
    }

    public void despedir() {
        System.out.println("Empleado despedido.");
    }

    public void calcularAumentoSalarial(double porcentaje) {
        salarioBase *= (1 + porcentaje / 100);
        System.out.println("Aumento salarial aplicado. Nuevo salario: " + salarioBase);
    }

    public String obtenerInformacionBasica() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Salario: " + salarioBase;
    }
}

public class Supervisor extends Empleado {

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2; 
    }

    public String obtenerInformacionCompleta() {
        return obtenerInformacionBasica() + ", Subordinados: " + numeroSubordinados;
    }
}

public class Director extends Supervisor {

    @Override
    public double calcularSalario() {
        return salarioBase * 1.5; 
    }

    public String obtenerInformacionCompletaParaDirector() {
        return obtenerInformacionCompleta() + ", Rol: Director";
    }
}
