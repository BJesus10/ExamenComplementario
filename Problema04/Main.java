
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        //Para agregar elementos a la lista
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        // Para mostrar antes de reordenar
        System.out.println("Lista original:");
        lista.mostrar();

        // Reordenamiento de la lista
        lista.reordenar();

        // Mostrar después de reordenar
        System.out.println("Lista reordenada:");
        lista.mostrar();
    }
}

