public class Cola {
    private class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fondo;

    public Cola() {
        frente = null;
        fondo = null;
    }

    
    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (fondo == null) {
            frente = nuevo;
        } else {
            fondo.siguiente = nuevo;
        }
        fondo = nuevo;
    }


    public Integer desencolar() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return null;
        }
        int valor = frente.valor;
        frente = frente.siguiente;
        if (frente == null) {
            fondo = null;
        }
        return valor;
    }

    public void pintarCola() {
        if (frente == null) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Cola: ");
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

