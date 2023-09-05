public class Main {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<5){
            System.out.printf("Hello! (%d) %n ",counter);//Hello! (0)
            //%d- переменная, которая указана через запятую -(,counter )
            System.out.printf("Hello! (%d (%d) %d) %n ",counter, counter+5, counter+10);//Hello! (0 (5) 10)
            counter = counter + 1;
        }
        System.out.println( "counter after while " + counter); //counter after while 5
        System.out.println("done");

        int count = 5;
        while (count>0){
            System.out.printf("Hello! (%d) %n ",count);
            System.out.printf("Hello! (%d (%d) %d) %n ",count, count+5, count+10);
            count = count - 1;
        }
        System.out.println( "count after while "+count); //count after while 0
        System.out.println("done");
        System.out.println("-----------------------------------------------");
        //вывести на экран таблицу умножения на 10 от 0 до 10

        int mult = 10;
        int num = 0;
        while (num<=10){
            System.out.printf( "%d * %d  = %d%n" , num, mult, num*mult);
            num=num+1;
        }

        System.out.println("-----------------------------------------------");
        //Вывести заданное число в порядке убывания до 0

        int numm=8;
        while (numm>=0) {
            System.out.printf("%d%n",numm);
            numm= numm -1;
        }

        System.out.println("-----------------------------------------------");
        //Вывести все четные числа в диапазоне от 10 до 50
        int a = 10;
        int b = 50;

        while (a<=b){
            if (a%2==0) {//%остаток от деления называется модула
                System.out.println(a);
            }
            a=a+1;

        }
    }
    }


