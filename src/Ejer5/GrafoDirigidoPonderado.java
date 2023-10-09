/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer5;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Rafael Corredor
 */



 public class GrafoDirigidoPonderado {
    private int V; // Número de vértices
    private LinkedList<Arista>[] adj; // Lista de adyacencia

    public GrafoDirigidoPonderado(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Agregar una arista al grafo
    public void agregarArista(int origen, int destino, int peso) {
        adj[origen].add(new Arista(destino, peso));
    }

    // Clase para representar una arista
    class Arista {
        int destino;
        int peso;

        public Arista(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    // Algoritmo de Dijkstra para encontrar el camino más corto
    public void dijkstra(int origen) {
        // Inicializar distancias y conjunto de visitados
        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origen] = 0;
        boolean[] visitado = new boolean[V];

        // Encontrar camino más corto
        for (int i = 0; i < V - 1; i++) {
            int u = obtenerMinimo(distancias, visitado);
            visitado[u] = true;
            for (Arista arista : adj[u]) {
                if (!visitado[arista.destino] && distancias[u] != Integer.MAX_VALUE &&
                        distancias[u] + arista.peso < distancias[arista.destino]) {
                    distancias[arista.destino] = distancias[u] + arista.peso;
                }
            }
        }

        // Imprimir resultados
        for (int i = 0; i < V; i++) {
            System.out.println("Distancia desde " + origen + " a " + i + " es " + distancias[i]);
        }
    }

    // Función auxiliar para obtener el vértice con la distancia mínima no visitada
    private int obtenerMinimo(int[] distancias, boolean[] visitado) {
        int min = Integer.MAX_VALUE;
        int minIndice = -1;

        for (int i = 0; i < V; i++) {
            if (!visitado[i] && distancias[i] <= min) {
                min = distancias[i];
                minIndice = i;
            }
        }

        return minIndice;
    }
}


