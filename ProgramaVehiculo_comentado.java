import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado

public class ProgramaVehiculo { // Define la clase principal del programa

    public static void main(String[] args) { // Método principal donde inicia la ejecución

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner

        System.out.println("Ingrese la marca del vehículo:");
        String marca = sc.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = sc.nextLine();

        System.out.println("Ingrese la cilindrada:");
        int cilindrada = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese el tipo de combustible:");
        String combustible = sc.nextLine();

        System.out.println("Ingrese la capacidad de pasajeros:");
        int pasajeros = sc.nextInt();

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        sc.close(); // Cierra el Scanner
    }
}