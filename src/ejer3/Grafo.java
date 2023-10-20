/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rafael Corredor
 */
import java.util.*;

public class Grafo {
    private int V;
    private LinkedList<Vertice>[] adj;

    public Grafo(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adj[i] = new LinkedList<>();
    }

    public void agregarArista(int u, int v, int peso) {
        Vertice verticeV = new Vertice(v, peso);
        Vertice verticeU = new Vertice(u, peso);
        adj[u].add(verticeV);
        adj[v].add(verticeU);
    }

    public LinkedList<Vertice> obtenerAdyacentes(int v) {
        return adj[v];
    }

    public int getV() {
        return V;
    }
}
