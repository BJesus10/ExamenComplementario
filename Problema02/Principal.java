public class Principal {
    public static void main(String[] args) {
        int [] valores = {1,2};
        int [] valores2 = {1,2,1,5};
        ListaEnlazada lista = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada();
        ListaEnlazada lista3 = new ListaEnlazada();

       for (int i=0; i<valores.length; i++) {
           lista.agregar(valores[i]);
       }
       
       for (int i=0; i<valores2.length; i++) {
              lista2.agregar(valores2[i]);
       }

        System.out.println("Número 1: ");
        lista.mostrar();
        System.out.println("Número 2: ");
        lista2.mostrar();
            
        lista.nodoaNumero();
        lista2.nodoaNumero();

         int resultado = lista.nodoaNumero() - lista2.nodoaNumero();

         lista3.numeroaNodo(resultado);
         System.out.println("Resultado en lista enlazada: ");
         lista3.mostrar();
   }
}
