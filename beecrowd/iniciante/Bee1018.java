package beecrowd.iniciante;

import java.util.Scanner;

/*
 * In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.

* Input Sample	Output Sample
576             576
             5 nota(s) de R$ 100,00
             1 nota(s) de R$ 50,00
             1 nota(s) de R$ 20,00
             0 nota(s) de R$ 10,00
             1 nota(s) de R$ 5,00
             0 nota(s) de R$ 2,00
             1 nota(s) de R$ 1,00

* */
public class Bee1018 {

//    TODO TENTAR MELHORAR ESSA IMPLEMENTAÇÃO
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();

        System.out.println(a);
        System.out.println(a / 100 + " nota(s) de R$ 100,00");
        var restante = a % 100;
        System.out.println(restante / 50 + " nota(s) de R$ 50,00");
        restante = restante % 50;
        System.out.println(restante / 20 + " nota(s) de R$ 20,00");
        restante = restante % 20;
        System.out.println(restante / 10 + " nota(s) de R$ 10,00");
        restante = restante % 10;
        System.out.println(restante / 5 + " nota(s) de R$ 5,00");
        restante = restante % 5;
        System.out.println(restante / 2 + " nota(s) de R$ 2,00");
        restante = restante % 2;
        System.out.println(restante + " nota(s) de R$ 1,00");


    }
}
