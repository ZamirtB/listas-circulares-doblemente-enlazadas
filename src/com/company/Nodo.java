package com.company;

public class Nodo {
        private int dato;
        private Nodo anterior;
        private Nodo siguiente;

    public Nodo(int x) {
        dato = x;
        anterior = this;
        siguiente = this;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {

        this.dato = dato;

    }

    public Nodo getAnterior() {
        return anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAnterior(Nodo enlace) {
        this.anterior = enlace;
    }

    public void setSiguiente(Nodo enlace) {
        this.siguiente = enlace;
    }
}
