package com.company;

public class Lista {
    Nodo primero;
    Nodo ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }
    public void Insertar(int y) {
        Nodo nuevo = new Nodo(y);
        nuevo.setDato(y);
        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
            else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
            primero.setAnterior(ultimo);
        }
    }
    public void visualizar() {
        Nodo actual;
        actual = primero;
        if (actual != null) {
            do {
                System.out.println(actual.getDato() + " ");
                actual = actual.getSiguiente();
            }
            while (actual != primero);
        }
            else {
            System.out.println("\t Lista Circular vac�a.");
        }
    }
    public void ordenMenMay(int x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null)
            primero = nuevo;
        else {
            Nodo aux = primero;
            while ((aux.getSiguiente() != primero) && (aux.getDato() < x)) {
                aux = aux.getSiguiente();
            }
            if ((aux.getSiguiente() == primero) && (aux.getDato() < x)) {
                aux.setSiguiente(nuevo);
                nuevo.setAnterior(aux);
                nuevo.setSiguiente(primero);
                primero.setAnterior(nuevo);
            } else {
                Nodo ant = aux.getAnterior();
                nuevo.setAnterior(ant);
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
                aux.setAnterior(nuevo);
                if ((aux == primero) && (primero.getDato() > x))
                    primero = nuevo;
            }

        }
    }

    public void Eliminar(int i) {
        Nodo actual = new Nodo(i);
        Nodo atras = new Nodo(i);
        actual = primero;
        atras = ultimo;
        do {
            if (actual.getDato() == i) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                } else if (actual == ultimo) {
                    ultimo = atras;
                    primero.setAnterior(ultimo);
                    ultimo.setSiguiente(primero);
                }
                else {
                    atras.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(primero);
                }
            }
            atras = actual;
            actual = actual.getSiguiente();
        }
        while (actual != primero);
    }
}