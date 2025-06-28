public class ListaEnlazada {
    private Nodo head;
    private int size;

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

     public boolean estaVacia() {
        return head == null;
    }

    public int obtenerTamanio() {
        return size;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Lista vacía");
            return;
        }
        Nodo actual = head;
        while (actual.siguiente != null) {
            System.out.print(actual.valor + " --> ");
            actual = actual.siguiente;
        }
        System.out.println(actual.valor);
    }

    public void agregar(int valor) {
        if (estaVacia()) {
            head = new Nodo(valor);
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = new Nodo(valor);
        }
        size++;
    }

    public int nodoaNumero() {
        int suma = 0;
        if (estaVacia()) {
            return 0;
        }else {
            Nodo actual = head;
            
            for (int i = 0; i < size; i++) {
                suma = suma * 10 + actual.valor;
                actual = actual.siguiente;
            }
        }
        return suma;
    }

    public void numeroaNodo(int numero) {
        String numeroStr = String.valueOf(numero);
         head = null; 
         size = 0; 

        for (int i = 0; i < numeroStr.length(); i++) {
            int valor = Character.getNumericValue(numeroStr.charAt(i));
            Nodo nuevoNodo = new Nodo(valor);
            agregar(valor);
        }
    }
}