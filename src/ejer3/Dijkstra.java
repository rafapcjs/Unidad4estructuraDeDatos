/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author Rafael Corredor
 */
import java.util.*;

public class Dijkstra {
    public static void calcularRutaMinima(Grafo grafo, int nodoOrigen) {
        int V = grafo.getV();
        PriorityQueue<Vertice> colaPrioridad = new PriorityQueue<>(V, Comparator.comparingInt(Vertice::getPeso));

        int[] distancias = new int[V];
        Arrays.fill(distancias, Integer.MAX_VALUE);

        colaPrioridad.add(new Vertice(nodoOrigen, 0));
        distancias[nodoOrigen] = 0;

        while (!colaPrioridad.isEmpty()) {
            int u = colaPrioridad.poll().getVertice();
            LinkedList<Vertice> adyacentes = grafo.obtenerAdyacentes(u);

            for (Vertice v : adyacentes) {
                int pesoUV = v.getPeso();
                if (distancias[u] != Integer.MAX_VALUE && pesoUV + distancias[u] < distancias[v.getVertice()]) {
                    distancias[v.getVertice()] = pesoUV + distancias[u];
                    colaPrioridad.add(new Vertice(v.getVertice(), distancias[v.getVertice()]));
                }
            }
        }

        // Imprimir las distancias mínimas
        System.out.println("Nodo \t Distancia desde el nodo origen");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + distancias[i]);
    }
}
