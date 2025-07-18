package paquete;
import java.util.Scanner;

public class Clase {

    public static void main(String[] args) {
        // Declarar variables fuera del ciclo para usarlas dentro y fuera
        int numero;
        String nombre;
        char letra;
        double temperatura;
        boolean estado;
        long numeroLargo;
        char volver;  // Nueva variable para control de repetición

        Scanner in = new Scanner(System.in);

        do {
            // Entrada de Datos: Pueden ser solicitados o no        
            System.out.print("Ingrese un número: ");
            numero = in.nextInt();

            System.out.print("Ingrese un nombre: ");
            nombre = in.next();

            System.out.print("Ingrese una letra: ");
            letra = in.next().charAt(0);

            System.out.print("Ingrese un valor de temperatura: ");
            temperatura = in.nextDouble();

            System.out.print("Ingrese un estado (Verdadero = true, Falso = false): ");
            estado = in.nextBoolean();

            System.out.print("Ingrese un número Largo: ");
            numeroLargo = in.nextLong();

            // Salida de Datos: Resultado(s).
            System.out.println("\nEl número ingresado fue: " + numero);        
            System.out.println("El nombre ingresado fue: " + nombre);        
            System.out.println("La letra ingresada fue: " + letra);
            System.out.println("La temperatura ingresada fue: " + temperatura);
            System.out.println("El estado ingresado fue: " + estado);
            System.out.println("El número largo ingresado fue: " + numeroLargo);

            // Preguntar si desea volver al menú
            System.out.print("\n¿Desea volver al menú? Presione 'S' para repetir, cualquier otra tecla para salir: ");
            volver = in.next().charAt(0);

        } while (volver == 'S' || volver == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
        in.close();
    }

}
