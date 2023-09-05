public class Main {
    public static void main(String[] args) {

        int[] array = {1,3,4,6,7};

        //создаем новый массив на 10 элементов
        int[] arr2 = new int[10];
        arr2[3]=19;//3ему элементу массиву присваиваем 19
        arr2[0]=1;//0му элементу массиву присваиваем 1
        System.out.println(arr2[9]);

        arr2[9]=2;//0му элементу массиву присваиваем 1
        //arr2[9]=2;//0му элементу массиву присваиваем 1
        System.out.println(arr2[9]);
        printArray(arr2); //1 0 0 19 0 0 0 0 0 0 1


        //обращаемся к каждому элементу массива по индексу
        System.out.println(array[0]); //1
        System.out.println(array[1]); //3
        System.out.println(array[2]); //4

        System.out.println(array.length);//длина массива 5

        printArray(array);
    }


    //метод печатающий массив
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}