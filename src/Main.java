public class Main {
    public static void main(String[] args) {
        saludar("Ana");
        saludar("");
    }

    public static void saludar(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            System.out.println("Hola, " + nombre + "!");
        } else {
            System.out.println("Hola, Mundo!");
        }
    }
}

