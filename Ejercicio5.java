public class Main {
    private int longitud;
    private String cadena;
    public Main() {
        this.longitud = 0;
        this.cadena = "";
    }
    public Main(String cadena) {
        this.longitud = cadena.length();
        this.cadena = cadena;
    }
    public int getLongitud() {
        return longitud;
    }
    public String getCadena() {
        return cadena;
    }
    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return '\0'; 
        }
    }
    public void visualizar() {
        System.out.println("Longitud: " + longitud);
        System.out.println("Cadena: " + cadena);
    }
    public static void main(String[] args) {
        Main miCadena = new Main("Hola, mundo!");
        miCadena.visualizar();
        int indice = 7;
        char caracterEnIndice = miCadena.caracter(indice);
        if (caracterEnIndice != '\0') {
            System.out.println("El carácter en el índice " + indice + " es: " + caracterEnIndice);
        } else {
            System.out.println("El índice está fuera de rango.");
        }
    }
}

