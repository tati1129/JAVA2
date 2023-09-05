import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1.----------------------------------");
        /*
        Вася спит днем если он не работает или у него отпуск.
        Переменная weekday=true если это рабочий день, переменная vacation=true если у него отпуск.
        Написать программу, выводящую на экран если Вася спит. Переменная result=true когда Вася спит
        weekday     vacation     result
        false       false     -> true
        true        false     -> false
        false       true      -> true
        */

        boolean weekday = false;
        boolean vacation = false;
        boolean result = !weekday || vacation;

       System.out.println(result);

        System.out.println("2.----------------------------------");
       /*
       Воспитательница в детском саду знала, что если Вася и Петя оба смеются или оба очень серьезные, то они что-то затевают и надо быть внимательной. Помогите воспитательнице и напишите выражение, дающее true когда оба смеются или оба мрачные
       petya    vasya
       true     true    -> true
       false    false   -> true
       true     false   -> false
       false    true    -> false
        */

        boolean petya = false;
        boolean vasya = true;

        boolean res1 = (petya && vasya) || (!petya && !vasya);
        boolean res2 = petya==vasya;
        boolean res3 = !(petya^vasya);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        System.out.println("3.--------------------------------------");

        /*
        Напишите программу, возвращающую сумму двух целых чисел. А в случае если эти числа равны, возвращающую двойную сумму.
         */

        /*
        Scanner sc1 = new  Scanner(System.in);
        System.out.println("Введите первое число от 1 до 100");
        int num1 = sc1.nextInt();

        Scanner sc2 = new  Scanner(System.in);
        System.out.println("Введите второе число от 1 до 100");
        int num2 = sc2.nextInt();

        int sum = num1+num2;
        if (num1!=num2){
            System.out.println(sum);
        }else {
            sum=sum*2;
            System.out.println(sum);
        }

         */

        System.out.println("4.--------------------------------------------");

        /*
        Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит слушать громкую музыку. У Васи проблемы, если слушает музыку и еще нет 7 утра или уже позже 20.00.
        Напишите выражение дающее true если у Васи проблемы.
        music = true, когда сосед слушает музыку.
        int hour - время в диапазоне от 0 до 23.00 часов.
        music   hour
        true    6   -> true
        true    7   -> false
        false   21   -> false

         */

        boolean music = true;
        int hour = 21;

        boolean result1 = !music && hour<7 && hour>20;
        System.out.println(result1);
    }
}