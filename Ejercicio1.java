import java.util.Scanner;

public class Main {
    private int horas;
    private int minutos;
    private int segundos;

    public Main() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Main(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void sumarHoras(Main otraHora) {
    this.segundos += otraHora.segundos;
    this.minutos += otraHora.minutos;
    this.horas += otraHora.horas;

    if (this.segundos >= 60) {
        this.segundos -= 60;
        this.minutos++;
        }

    if (this.minutos >= 60) {
        this.minutos -= 60;
        this.horas++;
            }

    if (this.horas >= 24) {
        this.horas -= 24;
            }

    System.out.println("Resultado de la suma:");
    this.visualizarHora();
}
    public static void main(String[] args) {
        Main hora1 = new Main(5, 30, 45);
        Main hora2 = new Main(2, 15, 20);

        Main horaNoInicializada = new Main();

        System.out.println("Hora 1:");
        hora1.visualizarHora();
        System.out.println("Hora 2:");
        hora2.visualizarHora();

        horaNoInicializada.sumarHoras(hora1);
        horaNoInicializada.sumarHoras(hora2);
    }
}
