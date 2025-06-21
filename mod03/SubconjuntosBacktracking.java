
import java.util.ArrayList;
import java.util.List;

public class SubconjuntosBacktracking {

    public static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void backtrack(int[] S, int n, int inicio, List<Integer> atual, List<List<Integer>> resultado) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            atual.add(S[i]);
            backtrack(S, n, i + 1, atual, resultado);
            atual.remove(atual.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subconjuntos = gerarSubconjuntos(S, n);
        System.out.println("Subconjuntos de tamanho " + n + ": " + subconjuntos);
    }
}
