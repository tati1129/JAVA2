public class Main {
    /*
    1.      Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод, который вместо заданной строки с номером счета (например ”DE5128279087265”) возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству засекреченных цифр). Реализуйте 2 варианта метода: 1) с использованием только циклов, length() и charAt()  2) используя любые необходимые методы класса String

2.     Реализовать метод String replace(String str, String oldStr, String newStr) который  в данной строке str меняет все подстроки oldStr на подстроки newStr Например:
            ("Hello world!", "world", "all") - "Hello all!"
            ("Hello world!", "l", "L") - "HeLLo worLd!"
            ("Hello world!", "qwe", "L") - "Hello world!"
            ("Hello world!", "ll", "") - "Heo world!"
    Ограничения: в данной задаче нельзя использовать стандартные методы String, кроме length(), charAt() и equals()

     */

    public static void main(String[] args) {
        String str = "HeLLo worLd!";

        System.out.println(bankNum1("DE5128279087265"));
        System.out.println(bankNum2("DE5128279087265"));
        System.out.println(bankNum3("DE5128279087265"));
        //System.out.println(str2.equals(oldStr));
        System.out.println(replace1("HeLLo worLd!","world","all"));
        //System.out.println(4*("*"));
    }

    public static String bankNum1(String str){
       String newStr = "";
        for (int i =0; i < str.length() ; i++) {
            newStr += ((i<4 || i>=str.length()-2 ) ? str.charAt(i) : "*");
            /*
            if (i<4 || i>=str.length()-2 ){
                newStr+=str.charAt(i);
            } else {
                newStr+="*";
            }
             */

        }

        return newStr;
    }

    public static String bankNum2(String str){
        String newStr = "";
        String part1 = str.substring(0,4);

        String hover = "";
        String num = str.substring(4,str.length()-2);
        for (int i = 0; i < num.length(); i++) {
            hover += "*";
        }
        String part2 = str.substring(str.length()-2);

        newStr+=part1 + hover + part2;

        return newStr;
    }

    public  static String bankNum3(String str){
        int length = str.length();

        if (length <= 6){
            return str;
        }
        String result = str.substring(0,4);// вырезаем первые 4 и записваем в result
        result += "*".repeat(length-6);//добавлям в result кол-во=длина-(4+2) "*" штук
        result += str.substring(length-2);//добавлям в result 2 последние

        return  result;
    }

    public static String replace1(String str, String oldStr, String newStr){
        String res = "";

       int length = str.length();
       int old = oldStr.length();

       if (old == 0){
           for (int i = 0; i < length; i++) {
               res += newStr;
               if (i< length - 1){
                   res += str.charAt(i);
               }
           }
       }else {
        for (int i = 0; i <length ; i++) {
            boolean found = true;

            for (int j = 0; j < old; j++) {
                if (i+j >= length || Character.toLowerCase(str.charAt(i+j)) != Character.toLowerCase(oldStr.charAt(j))){
                    found = false;
                    break;
                }
            }

            if (found) {
                res += newStr;
                i += old - 1;

            }else {
                res += str.charAt(i);
                }
            }
       }

        return  res;
    }
}