/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1;

/**
 *
 * @author Rafael Corredor
 */
public class ArbolBinarioBusqueda {
 
    

   public Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarNodo(nodo.derecho, valor);
        }

        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarNodo(raiz, valor);
    }

    private boolean buscarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.valor) {
            return true;
        } else if (valor < nodo.valor) {
            return buscarNodo(nodo.izquierdo, valor);
        } else {
            return buscarNodo(nodo.derecho, valor);
        }
    }

    public void recorridoInOrden() {
        recorridoInOrden(raiz);
    }

    private void recorridoInOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoInOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInOrden(nodo.derecho);
        }
    }

    public void recorridoPreOrden() {
        recorridoPreOrden(raiz);
    }

    private void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);
        }
    }

    public void recorridoPostOrden() {
        recorridoPostOrden(raiz);
    }

    private void recorridoPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostOrden(nodo.izquierdo);
            recorridoPostOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
  public void imprimirInOrden(Nodo nodo) {
        if (nodo != null) {
            imprimirInOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirInOrden(nodo.derecho);
        }




        
    }}
