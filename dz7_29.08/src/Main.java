public class Main {
    public static void main(String[] args) {
        //Необходимо написать программу, которая печатает все целые числа в диапазоне между num1 и num2 включительно. Учтите, num1 может быть как меньше, так больше или равно num2. Например: num1=3   num2=5;
        // Выводим:
        //3
        //4
        //5

        int num1 = 3;
        int num2 = 5;

            int temp = num2;// вводим переменную, чтоб не изменять num2, а сохранить ее значение для использования в другой переменной;
            while (num1 >= temp) {
                System.out.printf("%d %n", temp);
                temp = temp + 1;
            }

            while (num2 > num1) {
                System.out.printf("%d %n", num1);
                num1 = num1 + 1;
            }

        System.out.println("----------------------------------------------------------------");
        //В предыдущей задаче, для каждого числа, которое делится на 2 выводить надпись «делиться на 2». Для каждого числа, которое делится на 3 выводить надпись «делится на 3»

        int numm1 = 1;
        int numm2 = 8;
        String dividedTwo = "делится на 2 ";
        String dividedThree = "делится на 3 ";


        int min = numm1, max = numm2 ;
        if (numm1>numm2){
            min=numm2;
            max=numm1;
            }


            while (min <= max) {
                System.out.print(min + " ");

                if (min % 2 == 0) {
                    System.out.print(dividedTwo);
                }
                if (min % 3 == 0) {
                    System.out.print(dividedThree);
                }
                min = min + 1;
                    System.out.println();
            }

/*
            while (min <= max) {
                if (min % 2 == 0 && min %3 == 0){
                    System.out.printf("%d %s и %s %n", min, dividedTwo, dividedThree);
                    min = min + 1;
                if (min % 2 == 0) {
                    System.out.printf("%d %s %n", min, dividedTwo);
                    min = min + 1;
                } else if (min % 3 == 0) {
                    System.out.printf("%d %s %n", min, dividedThree);
                    min = min + 1;
                } else {
                    System.out.printf("%d %n", min);
                    min = min + 1;
                }
            } */
        }
    }
