package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1021 {
/*
Banknotes and Coins

Read a value of floating point with two decimal places. This represents a monetary value. After this,
calculate the smallest possible number of notes and coins on which the value can be decomposed.
The considered notes are of 100, 50, 20, 10, 5, 2.
 The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01.
 Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.

Input Sample	Output Sample
576.73          NOTAS:
                5 nota(s) de R$ 100.00
                1 nota(s) de R$ 50.00
                1 nota(s) de R$ 20.00
                0 nota(s) de R$ 10.00
                1 nota(s) de R$ 5.00
                0 nota(s) de R$ 2.00
                MOEDAS:
                1 moeda(s) de R$ 1.00
                1 moeda(s) de R$ 0.50
                0 moeda(s) de R$ 0.25
                2 moeda(s) de R$ 0.10
                0 moeda(s) de R$ 0.05
                3 moeda(s) de R$ 0.01
* */

//    DÁ ERRO NA ÚLTIMA CONVERSSÃO
//    PASSANDO VALOR 0,06 QUANDO ELE VAI VERIFICAR A MOEDA 0,01 DÁ ESSE VALOR 0.9999999999999994
//    logo não sendo 0,01 ele não contabiliza a moeda
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notes = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] coins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        double restante = scanner.nextDouble();
        System.out.println("NOTAS:");
        for (int i = 0; i < notes.length; i++) {
            Double response = restante / notes[i];
            System.out.printf(response.intValue() + " nota(s) de R$ %.2f%n", notes[i]);
            restante = restante % notes[i];
        }

        System.out.println("MOEDAS:");
        for (int j = 0; j < coins.length; j++) {
            Double response = restante / coins[j];
            System.out.printf(response.intValue() + " moeda(s) de R$ %.2f%n", coins[j]);
            restante = restante % coins[j];
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        double input = scanner.nextDouble();
        int restante = (int) Math.round(input * 100); // transforma em centavos e arredonda

        System.out.println("NOTAS:");
        for (int note : notes) {
            int qtd = restante / note;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtd, note / 100.0);
            restante %= note;
        }

        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int qtd = restante / coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtd, coin / 100.0);
            restante %= coin;
        }
    }
}
