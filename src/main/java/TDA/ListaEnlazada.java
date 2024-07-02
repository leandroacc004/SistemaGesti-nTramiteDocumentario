package TDA;

public class ListaEnlazada<T> {

    private Nodo<T> L;

    public ListaEnlazada() {
        this.L = null;
    }

    public boolean estaVacia() {
        return this.L == null;
    }

    public void mostrar() {
        Nodo<T> ptr = this.L;
        while (ptr != null) {
            System.out.print(ptr.getValue() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println("");
    }

    public void insertar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);

        if (estaVacia()) {
            this.L = nuevo;
        } else {
            Nodo<T> ptr = this.L;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(nuevo);
        }
    }

    public void eliminar(T valor) {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        if (this.L.getValue().equals(valor)) {
            this.L = this.L.getNext();
            return;
        }
        Nodo<T> ptr = this.L;
        Nodo<T> anterior = null;

        while (ptr != null && !ptr.getValue().equals(valor)) {
            anterior = ptr;
            ptr = ptr.getNext();
        }
        if (ptr == null) {
            System.out.println("El valor no se encuentra en la lista");
            return;
        }
        anterior.setNext(ptr.getNext());
    }

    public T buscar(T valor) {
        Nodo<T> ptr = this.L;
        while (ptr != null && !ptr.getValue().equals(valor)) {
            ptr = ptr.getNext();
        }
        if (ptr == null) {
            return null;
        } else {
            return ptr.getValue();
        }
    }

    public int getLength() {
        Nodo<T> ptr = this.L;
        int numberLength = 0;
        while (ptr != null) {
            System.out.println("Se suma unoooo");
            numberLength += 1;
            ptr = ptr.getNext();
        }
        return numberLength;
    }

    public Nodo<T> obtenerPrimero() {
        return L;
    }

}
