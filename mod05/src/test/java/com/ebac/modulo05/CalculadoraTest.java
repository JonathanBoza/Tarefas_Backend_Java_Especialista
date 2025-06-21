package com.ebac.modulo05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private static final Logger logger = LoggerFactory.getLogger(CalculadoraTest.class);
    private Calculadora calc;

    @BeforeEach
    public void setup() {
        calc = new Calculadora();
        logger.info("Criando nova instância da Calculadora para teste");
    }

    @Test
    public void testAdicao() {
        int a = 6, b = 4;
        logger.info("Testando adição: {} + {}", a, b);
        int resultado = calc.adicionar(a, b);
        logger.info("Resultado da adição: {}", resultado);
        assertEquals(10, resultado);
    }

    @Test
    public void testSubtracao() {
        int a = 6, b = 4;
        logger.info("Testando subtração: {} - {}", a, b);
        int resultado = calc.subtrair(a, b);
        logger.info("Resultado da subtração: {}", resultado);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicacao() {
        int a = 6, b = 4;
        logger.info("Testando multiplicação: {} * {}", a, b);
        int resultado = calc.multiplicar(a, b);
        logger.info("Resultado da multiplicação: {}", resultado);
        assertEquals(24, resultado);
    }

    @Test
    public void testDivisao() {
        int a = 12, b = 4;
        logger.info("Testando divisão: {} / {}", a, b);
        int resultado = calc.dividir(a, b);
        logger.info("Resultado da divisão: {}", resultado);
        assertEquals(3, resultado);
    }

    @Test
    public void testDivisaoPorZero() {
        int a = 10, b = 0;
        logger.info("Testando divisão por zero: {} / {}", a, b);
        assertThrows(ArithmeticException.class, () -> {
            try {
                calc.dividir(a, b);
            } catch (ArithmeticException e) {
                logger.error("Erro esperado capturado: {}", e.getMessage());
                throw e;
            }
        });
        logger.info("Teste de divisão por zero concluído com sucesso");
    }
}
