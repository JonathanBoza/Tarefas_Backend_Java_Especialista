
public class MeuHashMap {
    private static class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 10;
    private Entry[] tabela;

    public MeuHashMap() {
        tabela = new Entry[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Entry novo = new Entry(key, value);
        Entry atual = tabela[index];

        if (atual == null) {
            tabela[index] = novo;
        } else {
            Entry anterior = null;
            while (atual != null) {
                if (atual.key == key) {
                    atual.value = value;
                    return;
                }
                anterior = atual;
                atual = atual.next;
            }
            anterior.next = novo;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        Entry atual = tabela[index];
        while (atual != null) {
            if (atual.key == key) {
                return atual.value;
            }
            atual = atual.next;
        }
        return null;
    }

    public void delete(int key) {
        int index = hash(key);
        Entry atual = tabela[index];
        Entry anterior = null;

        while (atual != null) {
            if (atual.key == key) {
                if (anterior == null) {
                    tabela[index] = atual.next;
                } else {
                    anterior.next = atual.next;
                }
                return;
            }
            anterior = atual;
            atual = atual.next;
        }
    }

    public void clear() {
        tabela = new Entry[SIZE];
    }

    // Teste simples do HashMap
    public static void main(String[] args) {
        MeuHashMap mapa = new MeuHashMap();
        mapa.put(1, 100);
        mapa.put(2, 200);
        mapa.put(12, 1200); // colisão com chave 2

        System.out.println("Valor da chave 1: " + mapa.get(1));
        System.out.println("Valor da chave 2: " + mapa.get(2));
        System.out.println("Valor da chave 12: " + mapa.get(12));

        mapa.delete(2);
        System.out.println("Após remover chave 2, get(2): " + mapa.get(2));

        mapa.clear();
        System.out.println("Após clear, get(1): " + mapa.get(1));
    }
}
