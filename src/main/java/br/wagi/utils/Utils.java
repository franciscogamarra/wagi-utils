package br.wagi.utils;

import java.math.BigInteger;

public class Utils {

   public class Calculadora {

        public Calculadora() {
        }

        public Integer soma(Integer a, Integer b) {
            return a + b;
        }
        public Integer subtracao(Integer a, Integer b) {
            return a - b;
        }
    }

    public class Fibonacci {

        public Fibonacci() {
        }

        public BigInteger fibonacci(int n) {
            if (n <= 0) return BigInteger.ZERO;
            if (n == 1) return BigInteger.ONE;

            BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c = BigInteger.ZERO;
            for (int i = 2; i <= n; i++) {
                c = a.add(b);
                a = b;
                b = c;
            }
            return c;
        }
    }
}