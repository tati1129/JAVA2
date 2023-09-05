import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Дано целое число num. Необходимо написать программу, которая выводит на экран таблицу умножения num  до 10. Например, если num=3 то вывод должен быть таким:
        //           	3*1=3
        //           	3*2=6
        //           	3*3=9
        //           	-----
        //          	3*9=27
        //           	3*10=30

        int num1 = 3;
        int num2 = 10;
        int i = 1;
         while (i<=num2){
             System.out.printf("%d * %2d = %2d%n",num1,i,num1 * i);
             i+=1;
         }



        //Дано целое число num. Необходимо написать программу, которая считает, сколько разрядов в этом числе. Например:
        //           	3 -> 1
        //           	343 -> 3
        //           	98761 -> 5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        long nummer = scanner.nextLong();
        scanner.close();

        long temp = nummer;
        int counter = 0;

        if (temp == 0){
            counter=1;
        }

        while (temp!=0){
           temp/= 10;
            counter+=1;

        }
        System.out.printf("%d -> %d %n", nummer, counter);
        System.out.println("Hello world!");
    }
}