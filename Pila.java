public class Pila {

    private class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    private Nodo cima;

    public Pila() {
        cima = null;
    }


    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
    }


    public Integer pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        int valor = cima.valor;
        cima = cima.siguiente;
        return valor;
    }

 
    public void pintarPila() {
        if (cima == null) {
            System.out.println("Pila vacía");
            return;
        }
        System.out.print("Pila: ");
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
