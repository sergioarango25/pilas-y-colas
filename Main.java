public class Main {
    public static void main(String[] args) {
        System.out.println("|------- COLA --------|");
        Cola cola = new Cola();

        for (int i = 1; i <= 5; i++) {
            cola.encolar(i);
        }
        cola.pintarCola();
        cola.desencolar();
        cola.desencolar();
        cola.pintarCola();

        System.out.println("\n|------- PILA -------|");
        Pila pila = new Pila();

    
        for (int i = 1; i <= 5; i++) {
            pila.push(i);
        }
        pila.pintarPila();

  
        pila.pop();
        pila.pop();
        pila.pintarPila();
    }
}
