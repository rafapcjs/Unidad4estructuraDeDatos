/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Rafael Corredor
 */
public class Vertice {
    private int vertice;
    private int peso;

    public Vertice(int vertice, int peso) {
        this.vertice = vertice;
        this.peso = peso;
    }

    public int getVertice() {
        return vertice;
    }

    public int getPeso() {
        return peso;
    }
}

