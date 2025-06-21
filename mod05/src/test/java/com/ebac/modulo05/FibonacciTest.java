package com.ebac.modulo05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private static final Logger logger = LoggerFactory.getLogger(FibonacciTest.class);
    private Fibonacci fib;

    @BeforeEach
    public void setup() {
        fib = new Fibonacci();
        logger.info("Criando nova instância de Fibonacci para teste");
    }

    @Test
    public void testFibonacciZero() {
        int n = 0;
        logger.info("Testando Fibonacci para n = {}", n);
        int resultado = fib.calcular(n);
        logger.info("Fibonacci({}) = {}", n, resultado);
        assertEquals(0, resultado);
    }

    @Test
    public void testFibonacciUm() {
        int n = 1;
        logger.info("Testando Fibonacci para n = {}", n);
        int resultado = fib.calcular(n);
        logger.info("Fibonacci({}) = {}", n, resultado);
        assertEquals(1, resultado);
    }

    @Test
    public void testFibonacciCinco() {
        int n = 5;
        logger.info("Testando Fibonacci para n = {}", n);
        int resultado = fib.calcular(n);
        logger.info("Fibonacci({}) = {}", n, resultado);
        assertEquals(5, resultado);
    }
}
