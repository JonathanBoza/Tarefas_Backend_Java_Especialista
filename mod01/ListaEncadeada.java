
public class ListaEncadeada {
    private Node head;
    private int tamanho;

    public ListaEncadeada() {
        this.head = null;
        this.tamanho = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }

        if (head.next == null) {
            Node temp = head;
            head = null;
            tamanho--;
            return temp;
        }

        Node atual = head;
        while (atual.next.next != null) {
            atual = atual.next;
        }
        Node temp = atual.next;
        atual.next = null;
        tamanho--;
        return temp;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.next;
            }
            node.next = atual.next;
            atual.next = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.next;
            }
            atual.next = atual.next.next;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.next;
        }
        return atual;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public static class Node {
        int valor;
        Node next;

        public Node(int valor) {
            this.valor = valor;
            this.next = null;
        }
    }

    // Teste simples da lista encadeada
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));
        lista.printList();

        lista.insert(1, new Node(15));
        lista.printList();

        lista.remove(2);
        lista.printList();

        System.out.println("Elemento na posição 1: " + lista.elementAt(1).valor);
        System.out.println("Tamanho: " + lista.size());

        Node removido = lista.pop();
        System.out.println("Removido do fim: " + removido.valor);
        lista.printList();
    }
}
