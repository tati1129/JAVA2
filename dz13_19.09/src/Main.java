public class Main {
    public static void main(String[] args) {
        //Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue
        //Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
        //{3, 2, -1, 5, -3} ->10


        //createArr(2, 8);
        printArray(createArr(2, 8));

        int[] arr = {3, 2, -1, 5, -3};
        int[] arr1 = {-3, -2, -1, -5, -3};
        int[] arr2 = {0, 0, 0, 0, 0};

        System.out.println(sumPositiveNum(arr));
        System.out.println(sumPositiveNum(arr1));
        System.out.println(sumPositiveNum(arr2 ));

    }

    public static int[] createArr(int min, int max) {
        int[] array;
         if (min == max) {
            array = new int[0];
            array[0]=min;
        } else if (min < max) {
            array = new int[max - min];
            for (int i = 0; i < array.length; i++) {
                array[i] = min;
                min++;
            }
        } else {
            System.out.println(max + " < " + min);
            array = new int[0];
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d",array[i]);
        }
        System.out.println();
    }

    public static long sumPositiveNum(int[] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                sum += array[i];
            }
           // sum += (array[i]<0) ? array[i] : 0;
        }
        return sum;
    }
}