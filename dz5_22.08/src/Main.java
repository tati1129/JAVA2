public class Main {
    public static void main(String[] args) {
         /*
        First level: Используя знания об операторе IF,
        напишите программу, которая выводит на экран большее из 3 чисел.
        Числа заданы в виде переменных num1, num2, num3.
         */


        int num1 = 920;
        int num2 = 920;
        int num3 = 672;

        /*
        int max = num1;


        if (num2>=max){
            max=num2;
            if (num3>=max) {
                max = num3;
            }
        } else {
            if (num3>max){
                max = num3;
            }
        }
        System.out.println("The biggest number from " + num1 + " , " +num2+ " , "+num3+ "  is " + max);
    }*/

        int max;


        if (num1 >=num2 && num1 >=num3) {
            max = num1;
        } else if (num2 >=num1 && num2 >=num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("The biggest number from " + num1 + " , " + num2 + " , " + num3 + "  is " + max);
    }

}