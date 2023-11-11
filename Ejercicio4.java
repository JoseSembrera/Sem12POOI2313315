public class Main {
    private int horas;
    private int minutos;
    private int segundos;

    public Main(int horas, int minutos, int segundos) {
        establecerHora(horas, minutos, segundos);
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void establecerHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Hora no válida. Asegúrese de que las horas estén en el rango de 0 a 23, los minutos de 0 a 59 y los segundos de 0 a 59.");
        }
    }

    public void avanzar() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public void visualizar() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
        Main miHora = new Main(12, 30, 45);

        System.out.println("Hora actual:");
        miHora.visualizar();

        System.out.println("Avanzando la hora:");
        miHora.avanzar();
        miHora.visualizar();

        System.out.println("Poniendo a cero la hora:");
        miHora.ponerACero();
        miHora.visualizar();
    }
}
