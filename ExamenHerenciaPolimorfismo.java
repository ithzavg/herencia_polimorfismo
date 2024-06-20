/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenherenciapolimorfismo;

import java.util.Scanner;

/**
 *
 * @author ithzamary.vilchis
 */
public class ExamenHerenciaPolimorfismo {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion;

        Ave aveObj = new Ave();
        Perro perroObj = new Perro();

        System.out.println("Bienvenido al Zoo ");

        do {
            // Mostrar el menú de opciones
            System.out.println("Seleccione el animal");
            System.out.println("1. Ave");
            System.out.println("2. Perro");
            System.out.println("3. Salir ");
            
            // Leer la opción del usuario
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el tiempo de vuelo");
                    int tiempoVuelo = input.nextInt();
                    input.nextLine(); // Consumir el salto de línea pendiente
                    System.out.println("Dime el nombre del animal");
                    String nombreAnimal = input.nextLine();

                    System.out.println("Dime la edad del animal para calcular su edad humana");
                    int edadAnimal = input.nextInt();

                    System.out.println(aveObj.haceSonido(nombreAnimal));
                    System.out.println(aveObj.velocidadEnVuelo(tiempoVuelo));
                    System.out.println(aveObj.dormir(nombreAnimal));
                    System.out.println(aveObj.comer(nombreAnimal));
                    System.out.println(aveObj.calculaEdadHumana(edadAnimal));
                    break;

                case 2:
                    // Añade la lógica para el caso del perro aquí
                    break;

                case 3:
                    System.out.println("Hasta Luego");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 3);

        // Cerrar el Scanner
        input.close();
    }
}


