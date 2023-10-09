/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuElección;

/**
 *
 * @author Rafael Corredor
 */


import Ejer5.GrafoDirigidoPonderado;
import java.util.Scanner;

 class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            // Imprime el menú
            System.out.println("** Menú **");
            System.out.println("1. Implementar un árbol binario de búsqueda.");
            System.out.println("2. Calcular la altura de un árbol binario.");
            System.out.println("3. Encontrar la ruta más corta entre dos nodos en un grafo no dirigido.");
            System.out.println("4. Implementar un árbol AVL.");
            System.out.println("5. Calcular el camino más corto entre dos nodos en un grafo dirigido ponderado.");
            System.out.println("6. Salir.");
            // Solicita la opción al usuario
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Ejecuta la opción seleccionada
            switch (opcion) {
                case 1:
                    // Implementa un árbol binario de búsqueda.
                    System.out.println("Implementando un árbol binario de búsqueda...");
                    break;
                case 2:
                    // Calcula la altura de un árbol binario.
                    System.out.println("Calculando la altura de un árbol binario...");
                    break;
                case 3:
                    // Encuentra la ruta más corta entre dos nodos en un grafo no dirigido.
                    System.out.println("Encontrando la ruta más corta entre dos nodos en un grafo no dirigido...");
                    break;
                case 4:
                    // Implementa un árbol AVL.
                    System.out.println("Implementando un árbol AVL...");
                    break;
                case 5:
                    
                    GrafoDirigidoPonderado grafo = new GrafoDirigidoPonderado(5);
                grafo.agregarArista(0, 1, 10);
                grafo.agregarArista(0, 2, 3);
                grafo.agregarArista(1, 2, 1);
                grafo.agregarArista(1, 3, 2);
                grafo.agregarArista(2, 1, 4);
                grafo.agregarArista(2, 3, 8);
                grafo.agregarArista(2, 4, 2);
                grafo.agregarArista(3, 4, 7);
                System.out.print("Ingrese el nodo de inicio: ");
                int nodoInicio = scanner.nextInt();
                grafo.dijkstra(nodoInicio);
                     
                    break;
                case 6:
                    // Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
}
