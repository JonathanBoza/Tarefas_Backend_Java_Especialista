
public class Pilha {
    private int[] elementos;
    private int topo;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void push(int valor) {
        if (topo < capacidade - 1) {
            elementos[++topo] = valor;
        } else {
            throw new RuntimeException("Pilha cheia");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        } else {
            throw new RuntimeException("Pilha vazia");
        }
    }

    public int top() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            throw new RuntimeException("Pilha vazia");
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    // Teste simples da pilha
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo: " + pilha.top()); // 30
        System.out.println("Tamanho: " + pilha.size()); // 3

        while (!pilha.isEmpty()) {
            System.out.println("Pop: " + pilha.pop());
        }
    }
}
