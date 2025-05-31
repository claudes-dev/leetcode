package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    /*
    * Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.

Input Samples	Output Samples
3.0 4.0 5.2     TRIANGULO: 7.800
                CIRCULO: 84.949
                TRAPEZIO: 18.200
                QUADRADO: 16.000
                RETANGULO: 12.000
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        se a localização for PT-BR o nextFloat vai usar , ao invés de ponto
//        por exemplo 3,0 ao invés de 3.0
//        scanner.useLocale(Locale.US);


        float a = scanner.nextFloat();
        var b = scanner.nextFloat();
        var c = scanner.nextFloat();


        System.out.printf("TRIANGULO: %.3f%n", a * c / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * (Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f%n", b * b);
        System.out.printf("RETANGULO: %.3f%n", a * b);

    }
}
