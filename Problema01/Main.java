


public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        int[] datos = {1, 2, 2, 4, 5, 6, 7, 8};
        for (int num : datos) {
            lista.agregarFinal(num);
        }

        System.out.println("Lista original:");
        lista.imprimir();

        int k = 4;
        lista.invertirEnGrupos(k);

        System.out.println("Lista invertida por grupos de " + k + ":");
        lista.imprimir();
    }
}
