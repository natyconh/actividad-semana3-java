import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class ProgramaUsuario { // Define la clase principal del programa

    public static void main(String[] args) { // Método principal donde inicia la ejecución

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer datos desde el teclado

        System.out.println("Ingrese su nombre:"); // Solicita el nombre
        String nombre = sc.nextLine(); // Guarda el nombre ingresado

        System.out.println("Ingrese su edad:"); // Solicita la edad
        int edad = sc.nextInt(); // Guarda la edad ingresada

        System.out.println("Su nombre es: " + nombre); // Muestra el nombre
        System.out.println("Su edad es: " + edad); // Muestra la edad

        sc.close(); // Cierra el Scanner
    }
}