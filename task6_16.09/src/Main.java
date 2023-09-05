public class Main {
    //написать метод, печатающий  числа от 0 до 10
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        printNum( 10);
        System.out.println(sumNum(1,5));
        System.out.println("-----------");

        //вывести на экран треугольник состоящий из цифр от 1 до числа n
        //1
        //12
        //123
        //1234
        //12345

        printTriangle(5);

        //вывести числа в форме треугольника
        //1
        //22
        //333
        //4444
        //55555

        printTriangleSame(5);

        // написать метод, возвращающий первые два символа строки ( Hello -> He)
        System.out.println(returnStr1("Hello!"));
        // написать метод, возвращающий 2й и 3й символы строки ( Hello -> ll)
        System.out.println(returnStr2("Hello!", 2,3));
        //Написать метод переставляющий первую букву в конец (abcd -> bcda)
        System.out.println(firstInEnd2("abcd"));
        //Написать метод переставляющий последнюю букву в начало (abcd -> dabc)
        System.out.println(endInBegin1("abcd"));
        System.out.println(endInBegin2("abcd"));
        System.out.println(endInBegin3("abcd"));
    }


    public static void printNum(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println(" ");
    }


    public static int sumNum(int j, int k){
        int summ = 0;
        for (int i = j; j <= k ; j++) {
            summ+=j;
        }
        return summ;
    }

    public static void printTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void printTriangleSame(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public static String returnStr1(String str){
        String newStr = "";
        for (int i = 0; i < 2; i++) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }
    //или
    public static String returnStr2(String str){
       return str.substring(0,2);
    }


    public static String returnStr2(String str,int i1, int i2){
        String newStr = "";
        int index1  = i1 -1;
        int index2  = i2 -1;
        for (; index1 <= index2; index1++) {
            newStr+=str.charAt(index1);
           //newStr= newStr.t
        }
        return newStr.toUpperCase();
    }

    public static  String firstInEnd1(String str){
        //for (int i = 0; i < str.length() ; i++) { }
           String newStr = "";
           newStr = str.substring(1);
           newStr+=str.charAt(0);
        return  newStr;
    }
    public static  String firstInEnd2(String str){
        String newStr="";
        for (int i = 1; i < str.length() ; i++) {
           newStr+=str.charAt(i);
        }
        newStr+=str.charAt(0);
        return  newStr;
    }

    public static String endInBegin1(String str){

        String newStr ="";
        newStr+=str.charAt(str.length()-1);
        for (int i = 0; i <str.length()-1 ; i++) {
            newStr+=str.charAt(i);
        }

        return newStr;
    }
    public static String endInBegin2(String str){

        String newStr ="";
        newStr+=str.charAt(str.length()-1);
        newStr+=str.substring(0,str.length()-1);
        return newStr;
    }
    public static String endInBegin3(String str){
        String str1 = str.substring(str.length()-1);
        String str2 = str.substring(0,str.length()-1);
        String newStr = str1 +str2;
        return newStr;
    }
}