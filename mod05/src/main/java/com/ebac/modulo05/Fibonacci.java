package com.ebac.modulo05;

public class Fibonacci {

    public int calcular(int n) {
        if (n <= 1)
            return n;
        return calcular(n - 1) + calcular(n - 2);
    }
}
