public class Main {
    public static void main(String[] args) {

        int[] array= {1,2,3,5,7};
        int[] array1 = new int[10];
        System.out.println(array[0]); //1
        array[0] =78;
        System.out.println(array[0]); //78

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.print(array1[i] + " ");
        } // 78 0 2 0 3 0 5 0 7 0

        for (int i = 0; i < array1.length; i++) {
          //  System.out.print(array[i] + " ");
            System.out.print(array1[i] + " ");
        } //78 0 2 0 3 0 5 0 7 0 78 0 2 0 3 0 5 0 7 0 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //at Main.main(Main.java:16)  в // array1.length>array.length, дойдет до конца array.length и покажет ошибку, где он вышел за пределы array.length и там больше нет элементов

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " "); //0 1 2 3 4
        }
        System.out.println();

        int[] arr1 = {1,8,3,6};
        //дан не пустой массив целых чисел. Написать метод, возвращающий количество четных чисел в нем
        // {1,8,3,6} --> 2
        System.out.println("counter is : "+getEvenNum(arr1));

        //Написать метод, возвращающий максимальный элемент массива целых чисел
        // {1,8,3,6} --> 8
        System.out.println("max num is : " + getMaxNum(arr1));
        //Написать метод, возвращающий разность между максимальным и минимальным элементами
        // {1,8,3,6} --> 8-1=7
        System.out.println("max - min = " + difMaxMin(arr1));

    }

    public static int getEvenNum(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                counter++;
            }
        }
        return  counter;
    }

    public static int getMaxNum(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max<array[i]){
                max= array[i];
            }
        }
        return max;
    }

    public static int difMaxMin(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]){
                min = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max-min;
    }
}