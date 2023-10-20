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


import Ejer1.ArbolBinarioBusqueda;
import Ejer2.ArbolBinario;
import Ejer4.AVLTree;
import Ejer5.GrafoDirigidoPonderado;
import ejer3.Dijkstra;
import ejer3.Grafo;
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
                    ArbolBinarioBusqueda  arbol = new ArbolBinarioBusqueda();

        // Insertar nodos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);
arbol.imprimirInOrden(arbol.raiz);
        // Imprimir los nodos en orden
        System.out.println("Árbol binario en orden:");
        
                    break;
                case 2:
                    // Calcula la altura de un árbol binario.
                    System.out.println("Calculando la altura de un árbol binario...");
                    
                            ArbolBinario arbole = new ArbolBinario();
 int altura = arbole.obtenerAltura(arbole.raiz);
                    System.out.println("La altura del árbol binario es: " + altura);
                    break;
                case 3:
                         Grafo  grafo = new Grafo(5);

        grafo.agregarArista(0, 1, 2);
        grafo.agregarArista(0, 2, 4);
        grafo.agregarArista(1, 2, 1);
        grafo.agregarArista(1, 3, 7);
        grafo.agregarArista(2, 4, 3);
        grafo.agregarArista(3, 4, 1);

        int nodoOrigen = 0;
        Dijkstra.calcularRutaMinima(grafo, nodoOrigen);
                    // Encuentra la ruta más corta entre dos nodos en un grafo no dirigido.
                    System.out.println("Encontrando la ruta más corta entre dos nodos en un grafo no dirigido...");
                    break;
                case 4:
                    
// Implementa un árbol AVL.
                    System.out.println("Implementando un árbol AVL...");
                      AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        System.out.println("Árbol AVL después de inserción:");
        tree.inOrderTraversal(); // Debe imprimir: 10 20 30

        tree.delete(20);

        System.out.println("\nÁrbol AVL después de eliminación:");
        tree.inOrderTraversal(); // Debe imprimir: 10 30

        System.out.println("\nBúsqueda de elementos:");
        System.out.println("¿El elemento 10 está en el árbol? " + tree.search(10)); // Debe imprimir: true
        System.out.println("¿El elemento 20 está en el árbol? " + tree.search(20)); // Debe imprimir: false
    
                    break;
                case 5:
                    
                    GrafoDirigidoPonderado A = new GrafoDirigidoPonderado(5);
                A.agregarArista(0, 1, 10);
                A.agregarArista(0, 2, 3);
                A.agregarArista(1, 2, 1);
                A.agregarArista(1, 3, 2);
                A.agregarArista(2, 1, 4);
                A.agregarArista(2, 3, 8);
                A.agregarArista(2, 4, 2);
                A.agregarArista(3, 4, 7);
                System.out.print("Ingrese el nodo de inicio: ");
                int nodoInicio = scanner.nextInt();
                A.dijkstra(nodoInicio);
                     
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
