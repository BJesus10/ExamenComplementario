
public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor);
            if (actual.siguiente != null) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    //metodo para reordenar la lista
    public void reordenar() {
        if (cabeza == null || cabeza.siguiente == null) return;

        // 1. Encontrar el punto medio con punteros lento y rápido
        Nodo lento = cabeza;
        Nodo rapido = cabeza;
        while (rapido.siguiente != null && rapido.siguiente.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }

        // 2. Invertir la segunda mitad de la lista
        Nodo segundaMitad = invertirLista(lento.siguiente);
        lento.siguiente = null; // Cortar lista en 2 mitades

        // 3. Mezclar las dos mitades
        Nodo primeraMitad = cabeza;
        while (segundaMitad != null) {
            Nodo temp1 = primeraMitad.siguiente;
            Nodo temp2 = segundaMitad.siguiente;

            primeraMitad.siguiente = segundaMitad;
            segundaMitad.siguiente = temp1;

            primeraMitad = temp1;
            segundaMitad = temp2;
        }
    }

    // para llegar a invertir la lista
    private Nodo invertirLista(Nodo nodo) {
        Nodo anterior = null;
        while (nodo != null) {
            Nodo siguiente = nodo.siguiente;
            nodo.siguiente = anterior;
            anterior = nodo;
            nodo = siguiente;
        }
        return anterior;
    }
}

