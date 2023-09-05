public class Main {
    public static void main(String[] args) {
        //Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
        //Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.      Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2
        int[] arr1 = {1,3,6,-1,4,-5,9};
        String[] str = {"qwe","axcvbn","qwertyuio","qas"};
        System.out.println(getMinNum(arr1));
        System.out.println(getMaxIndex(str));
    }

    public static int getMinNum(int[] array){
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static int getMaxIndex(String[] array){
        if (array == null || array.length == 0 ){
            return -1; // если массив пустой
        }

        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex].length() < array[i].length()){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}