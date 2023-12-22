package studyNotes.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

// O "Queue" manipula Prioridade de FILAS (Primeiro a sair, último a entrar, etc) !!!
// OBS: TEM que ser FILHA da Classe "Comparable" !!
public class MainQueue {
    public static void main(String[] args) {
        // Pode usar o Método "reversed" no "new ProductComparatorByPrice" para REVERTER a Queue!!
        Queue<ProductHashcode> productQueue = new PriorityQueue<>(new ProductComparatorByPrice());
        productQueue.add(new ProductHashcode("Macarrão", 20.30, false));
        productQueue.add(new ProductHashcode("Ketchup", 13.27, true));
        productQueue.add(new ProductHashcode("Pizza", 20.30, true));
        productQueue.add(new ProductHashcode("Arroz", 35.46, false));

        if (!productQueue.isEmpty()) {
            for (ProductHashcode product : productQueue) {
                System.out.println("product: " + product);
            }
        }

        System.out.println("\n");

        // Os Métodos "remove" e "poll" Retorna APENAS o PRIMEIRO ELEMENTO e REMOVE o Resto!!!
        // ----------------------------------------------------------------------------
        // OBS: Pode usar esses Métodos ou Métodos parecidos para remover Vários Elementos da Queue
        // até determinada Condição!!!
        System.out.println("remove: " + productQueue.remove());
        System.out.println("poll: " + productQueue.poll());

    }
}
