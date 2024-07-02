package TDA;


public class Pilas {

    private int MAX_SIZE = 10;
    private int top;
    private int[] datos;

    public Pilas() {
        datos = new int[MAX_SIZE];
        top = -1;
    }

    public boolean estaVacia() {
        return top == -1;
    }

    public boolean estaLlena() {
        return top == MAX_SIZE - 1;
    }

    public void push(int item) {
        if (!estaLlena()) {
            top++;
            datos[top] = item;
        }
    }

    public Integer pop() {
        if (!estaVacia()) {
            int elem = datos[top];
            top--;
            return elem;
        }
        return null;
    }

    public void mostrarPila() {
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(datos[i] + " | ");
        }
        System.out.println("Top: " + top);
    }
}
