
public class FatorialDinamico {

    // Top-Down (com memoização)
    public static long fatorialTopDown(int n, long[] memo) {
        if (n == 0 || n == 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = n * fatorialTopDown(n - 1, memo);
        return memo[n];
    }

    // Bottom-Up (iterativo)
    public static long fatorialBottomUp(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        long[] memo = new long[numero + 1];

        System.out.println("Top-Down: " + fatorialTopDown(numero, memo));
        System.out.println("Bottom-Up: " + fatorialBottomUp(numero));
    }
}
