package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class DecomposicaoMonetaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int valorCentavos = (int) (valor * 100);

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        //loop que realiza o calculo de quantas notas a parte inteira preccisa
        for (int nota : notas) {
            int qtdNotas = valorCentavos / (nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNotas, (double) nota);
            valorCentavos %= nota * 100;
        }

        System.out.println("MOEDAS:");
        // lopp que faz o calculo de  quantas moedas a parte ddecimal precisa
        for (int moeda : moedas) {
            int qtdMoedas = valorCentavos / moeda;
            double valorMoeda = (double) moeda / 100;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoedas, valorMoeda);
            valorCentavos %= moeda;
        }

        scanner.close();
    }
}

