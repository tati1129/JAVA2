/*
1. Написать программу,в кот задано 2 дробных числа. Программа должна выводить на экран результат сложения, вычитания, умножения и деления этих чисел.
Например: задано 2 переменных 10.6 и 2.2 в результате
10.6 + 2.2 = 12.8
10.6 - 2.2 = 8.4
10.6 * 2.2 = 23.32
10.6 / 2.2 = 4.818181

 */

/*
2.  Написать программу, кот расчитывает на сколько увеличится площадь пиццы, если ее диаметр увеличить на N см. Площадь круга можно вычислить по формуле  (3.14 * R * R). Например исходная пицца диаметр 10см ( R1 = 10 / 2 = 5). Диаметр новой пиццы 16 см ( R2 = 16 / 2 = 8). Ответ : 122.46 см

 */


public class   Main {
    public static void main(String[] args) {
        System.out.println("1.__________________________________________________");
        double a = 10.6;
        double b = 2.2;

        System.out.println(a + " + " + b + "= " + (a + b));
        System.out.println(a + " - " + b + "= " + (a - b));
        System.out.println(a + " * " + b + "= " + (a * b));
        System.out.println(a + " / " + b + "= " + (a / b));

        System.out.println("2.__________________________________________________");
        int d1 = 10;
        int n = 6;
        int d2 = d1 + n;
        double r1 = d1/2.0;
        double r2 = d2/2.0;

        double area1 = Math.PI * Math.pow(r1,2);
        double area2 = Math.PI * Math.pow(r2,2); // квадрат r2
        double result = Math.abs(area2 - area1);// модуль числа, абсолют

        System.out.println("The area of pizza with diameter " + d1 + " is " + area1);
        System.out.println("The area of pizza with diameter " + d2 + " is " + area2);
        System.out.println("Result: " + result);



    }
}