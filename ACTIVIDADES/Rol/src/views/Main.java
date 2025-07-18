package views;

import models.Rol;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Crear lector de consola

        // Crear objeto Rol
        Rol objRol = new Rol();

        // Pedir al usuario el ID
        System.out.print("Ingrese el ID del Rol: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Pedir al usuario el nombre
        System.out.print("Ingrese el nombre del Rol: ");
        String nombre = scanner.nextLine();

        // Pasar los datos al objeto Rol
        objRol.setRolid(id);
        objRol.setRolname(nombre);

        // Mostrar los datos ingresados
        System.out.println("\nRol ingresado:");
        System.out.println("ID: " + objRol.getRolid());
        System.out.println("Nombre: " + objRol.getRolname());
    }   
}
