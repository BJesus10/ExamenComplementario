
public class ListaEnlazada {
    Nodo cabeza;

    public void agregarFinal(int valor) {
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

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor);
            if (actual.siguiente != null) System.out.print(" -> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void invertirEnGrupos(int k) {
        cabeza = invertirK(cabeza, k);
    }

    private Nodo invertirK(Nodo cabeza, int k) {
        Nodo actual = cabeza;
        Nodo anterior = null;
        Nodo siguiente = null;

        int contador = 0;
        Nodo temp = cabeza;
        int total = 0;
        while (temp != null && total < k) {
            temp = temp.siguiente;
            total++;
        }

        if (total == 0) return cabeza;

        while (actual != null && contador < k) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
            contador++;
        }

        if (siguiente != null) {
            cabeza.siguiente = invertirK(siguiente, k);
        }

        return anterior;
    }
}

    