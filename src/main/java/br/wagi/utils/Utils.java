package br.wagi.utils;

import java.util.Random;

public class Utils {

    public class Cpf {

        public String gerarCPF() {
            Random random = new Random();
            int[] cpf = new int[11];

            // Gerar os 9 primeiros dígitos aleatórios
            for (int i = 0; i < 9; i++) {
                cpf[i] = random.nextInt(10);
            }

            cpf[9] = calcularDigitoVerificador(cpf, 10);
            cpf[10] = calcularDigitoVerificador(cpf, 11);

            return String.format("%d%d%d%d%d%d%d%d%d-%d%d",
                    cpf[0], cpf[1], cpf[2], cpf[3], cpf[4], cpf[5],
                    cpf[6], cpf[7], cpf[8], cpf[9], cpf[10]);
        }

        private int calcularDigitoVerificador(int[] cpf, int peso) {
            int soma = 0;
            for (int i = 0; i < peso - 1; i++) {
                soma += cpf[i] * (peso - i);
            }
            int resto = soma % 11;
            return (resto < 2) ? 0 : 11 - resto;
        }
    }
}