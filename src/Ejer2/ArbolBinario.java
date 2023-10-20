/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer2;

/**
 *
 * @author Rafael Corredor
 */
public class ArbolBinario {
 public Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public int obtenerAltura(Nodo nodo) {
        if (nodo == null) {
            return -1;
        }

        int alturaIzquierda = obtenerAltura(nodo.izquierda);
        int alturaDerecha = obtenerAltura(nodo.derecha);

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }
}
