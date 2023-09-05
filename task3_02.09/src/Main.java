import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        // a || (b || c) = (a || b) && (a || c)
        // a && (b || c) = (a && b) || (a && c)
        //  !(a || b) = !a && !b
        //  !(a && b) = !a || !b

        //boolean a = true;
        //boolean b = true;
        boolean a = false;
        boolean b = true;
        if (!(a || b)){
            System.out.println("True1");
        } else {
            System.out.println("False1");
        }
        if (!a && !b){
            System.out.println("True2");
        } else {
            System.out.println("False2");
        }



        //1.Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит громко петь. У Васи проблемы, если сосед слушает музыку и еще нет 7 утра или уже позже 20 часов. Напишите выражение дающее true если у Васи проблемы. Singin = true когда сосед поет, int hour - время в диапазоне от 0 до 23 часов
        // singing      hour
        //true      6-> true
        //true      7-> false
        //false     5-> false

        boolean singing = true;
       // boolean singing = false;
        int hour=5;

        boolean result = (singing && (hour<7 || hour>20));
        System.out.println(result);
        //2.Написать выражение, проверяющее является ли год високосным.
        //Условия високосности года:
        //1. год делится на 4
        //2.год делится без остатка на 100
        //2.год делится без остатка на 100 и на 400

        int year = 2023;
        boolean condition1 = year%4==0;
        boolean condition2 = year%100!=0;
        boolean condition3 = (year%100 == 0) && (year%400==0);

        boolean resultYear = condition1 && (condition2 || condition3);
        System.out.println(resultYear);


        System.out.println("********************************");
        //Написать программу, кот выводит на экран цифры от 1 до 10
        int num1 = 1;
        while (num1<=10){
            System.out.println(num1);
            num1+=1;
        }

        System.out.println("********************************");
        //Написать программу, кот выводит на экран сумму цифр от 1 до 5
        int num2=1;
        int summ = 0;
        while (num2<=5){
            summ=summ+num2;
            num2+=1;
        }
        System.out.println(summ);


        System.out.println("********************************");
        //Написать программу, кот выводит на экран куб чисел от 1 до заданного n
        int num3=1;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int numm = scanner.nextInt();
        while (num3<=numm){
            System.out.println(num3*num3*num3);
            num3+=1;
        }
    }
}