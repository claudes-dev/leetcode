package beecrowd.iniciante;

import java.util.Scanner;

public class Bee1013 {
/*
Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:

MaiorAB = (a+b+abs(a-b))/2

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.

Input Samples	|   Output Samples
7 14 106        |   106 eh o maior
                |

*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        var maiorAB = (a+b +Math.abs(a-b))/2;
        var maior = (maiorAB+c+Math.abs(maiorAB-c))/2;



        System.out.println(maior + " eh o maior");
    }
}
