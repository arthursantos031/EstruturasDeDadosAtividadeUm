import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int tamanho = 10;
        int[] pilha = new int[tamanho];
        int topo = -1;

        //aplicação console de exemplo sobre pilhas :)
        System.out.println("Iniciando processo de carga da pilha...");

        topo = push(pilha, topo, 4);
        topo = push(pilha, topo, 12);
        topo = push(pilha, topo, 23);
        topo = push(pilha, topo, 8);

        System.out.println("Conteúdo da pilha após empilhamento: ");
        imprimirPilha(pilha, topo);

        System.out.println("Retirando dois itens da pilha...");
        topo = pop(pilha, topo);
        topo = pop(pilha, topo);

        System.out.println("\nConteúdo da pilha após retirada:");
        imprimirPilha(pilha, topo);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //exemplo sobre lista :)
        System.out.println("Iniciando processo da lista FIFO...");
        LinkedList<Integer> listaFila = new LinkedList<>();

        // Adicionando elementos na fila
        listaFila.addLast(5);
        listaFila.addLast(23);
        listaFila.addLast(2);
        System.out.println("Lista encadeada após adicionar elementos: " + listaFila);

        System.out.println("removendo...");
        int removido1 = listaFila.removeFirst();
        System.out.println("Elemento removido: " + removido1);
        System.out.println("Lista encadeada após a primeira remoção: " + listaFila);

        int removido2 = listaFila.removeFirst();
        System.out.println("Elemento removido: " + removido2);
        System.out.println("Lista encadeada  após a segunda remoção: " + listaFila);
    }


    public static int push(int[] pilha, int topo, int valor) {
        if (topo < pilha.length - 1) {
            topo++;
            pilha[topo] = valor;
            System.out.println("Empilhado: " + valor);
        } else {
            System.out.println("Pilha cheia. Não é possível empilhar " + valor);
        }
        return topo;
    }

    public static int pop(int[] pilha, int topo) {
        if (topo >= 0) {
            int valorRemovido = pilha[topo];
            topo--;
            System.out.println("Desempilhado: " + valorRemovido);
        } else {
            System.out.println("Pilha vazia. Não é possível desempilhar.");
        }
        return topo;
    }

    public static void imprimirPilha(int[] pilha, int topo) {
        if (topo == -1) {
            System.out.println("Não há itens na pilha.");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
            System.out.println();
        }
    }
}