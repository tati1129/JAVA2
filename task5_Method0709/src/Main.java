// Метод это кусок кода выделенный особым образом, который можно переиспользовать в программе
// void - пустой, кот ничего не возвращает
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int n = 5;

        while (i<=n){
            System.out.println("Number is: " + i + " and cbbe of " + i + " is: " + (i*i*i));
            i++;
        }


      countCube(1,3);

        System.out.println(countSumm(1,4));

        int a = countSumm(1,5);
        System.out.println(a);
    }

    public static void countCube(int a, int b){

        int res;
        while (a<=b){
            res = a*a*a;
            System.out.println("Number is: " + a + " and cube of " + a + " is: " + res);
            a++;
        }
       // return res;
    }

    public  static int countSumm(int begin, int end){
        int summ = 0;
        while (begin<=end){
            summ = summ + begin;
            begin=begin+1;
        }
        return summ;
    }
}