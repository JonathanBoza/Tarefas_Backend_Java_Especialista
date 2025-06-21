
public class Fila {
    private int[] elementos;
    private int frente;
    private int tras;
    private int tamanho;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho < capacidade) {
            tras = (tras + 1) % capacidade;
            elementos[tras] = valor;
            tamanho++;
        } else {
            throw new RuntimeException("Fila cheia");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int valor = elementos[frente];
            frente = (frente + 1) % capacidade;
            tamanho--;
            return valor;
        } else {
            throw new RuntimeException("Fila vazia");
        }
    }

    public int front() {
        if (!isEmpty()) {
            return elementos[frente];
        } else {
            throw new RuntimeException("Fila vazia");
        }
    }

    public int rear() {
        if (!isEmpty()) {
            return elementos[tras];
        } else {
            throw new RuntimeException("Fila vazia");
        }
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Teste simples da fila
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Front: " + fila.front()); // 1
        System.out.println("Rear: " + fila.rear());   // 3
        System.out.println("Size: " + fila.size());   // 3

        while (!fila.isEmpty()) {
            System.out.println("Dequeue: " + fila.dequeue());
        }
    }
}
