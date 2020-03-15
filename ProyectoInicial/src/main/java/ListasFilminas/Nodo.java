package lec06;

public class Nodo {

    private Persona dato;
    private Nodo next;

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

    public Nodo(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
