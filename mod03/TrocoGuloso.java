
import java.util.ArrayList;
import java.util.List;

public class TrocoGuloso {

    public static List<Integer> calcularTroco(int quantia, int[] moedas) {
        List<Integer> resultado = new ArrayList<>();
        for (int moeda : moedas) {
            while (quantia >= moeda) {
                quantia -= moeda;
                resultado.add(moeda);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1}; // ordenado do maior para o menor
        List<Integer> troco = calcularTroco(quantia, moedas);
        System.out.println("Troco para " + quantia + ": " + troco);
    }
}
