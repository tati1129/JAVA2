public class Main {

    public static void main(String[] args) {

        int a;
        a = 3;
        System.out.println("a in the 6 line is " + a);

        a= a+1;
        System.out.println("a in the 9 line is " + a);
        System.out.println(a*a);


        double d = 3.0/4.0;
        System.out.println(d);

        double f = 22.0/7;
        System.out.println(f);

        int k = 22/7;
        System.out.println(k);

        //остаток от деления
        double s = 22.3%7;
        System.out.println(s);

        //double r = 22D%7;
        double r = 22%7;
        System.out.println(r);

        //Написать программу, кот выводит на экран сумму 2-х чисел 54 и 16
        System.out.println("1_____________________________________________________");
        int x=54;
        int y=16;
        System.out.println("The sum of numbers "+x + " and "+ y+" is " + (x+y));
        //Написать программу, кот выводит на экран результат деления 2-х чисел 50 и 3
        System.out.println("2_____________________________________________________");
        int o = 50;
        int l = 3;
        System.out.println("Result of dividing numbers "+ o + " and " + l + " is " + (o/l));
        //Написать программу, кот выводит на экран результат след операций: (-5 + 8*6); (55+9)%9
        System.out.println("3_____________________________________________________");
        int g = (-5 + 8*6);
        int m = (55+9)%9;
        System.out.println("The result of calculations (-5 + 8*6)  is " + g);
        System.out.println("The result of calculations (55+9)%9  is " + m);
        //Написать программу, кот выводит на экран значение переменной типа инт в квадрате.
        // Предварительно объявите эту переменную и задайте ей значение
        System.out.println("4_____________________________________________________");
        int t;
        t=22;
        System.out.println("The square of number 22 is " + t*t );

        //Пусть цена товара А обычно составляет 1000евро и товара В составляет 500 евро.
        //Клиент покупает товары вместе и поэтому на них действует скидка 100евро на всю покупку.
        //Выведите на экран переменную, которая соответствует стоимости товаров А и В со скидкой.
        System.out.println("5_____________________________________________________");
        int priceA = 1000;
        int priceB = 500;
        int discount = 100;
        int summ = priceA+priceB - discount;
        System.out.println("The purchase price of goods A and B is " + summ);
    }
}