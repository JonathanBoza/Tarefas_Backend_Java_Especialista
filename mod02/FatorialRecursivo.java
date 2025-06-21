
public class FatorialRecursivo {
    public static long fatorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
    }
}
