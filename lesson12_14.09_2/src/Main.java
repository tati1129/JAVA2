// тернарный оператор
// void - значит, что от метода не ждем результатов, т.е. ничего не возвращает (вывод на экран и все, например), там нет слова return
public class Main {
    public static void main(String[] args) {
        String str = "hello";

        System.out.println(translate(str));
        System.out.println(translate("Hi!"));

        System.out.println("-----------------------------");
        printIsEven(3); // 6
        printIsEven(10); // 5



        //Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»


        String str1 = "Enkoding, kounting";
        char oldChar = 'k';
        char newChar = 'c';
        String replacedStr = replace(str1, oldChar, newChar);
        System.out.println(replacedStr);
    }


    public static String translate(String str){
       return (str.equals("hello") ? "Привет" : str);
    }


    public static  void  printIsEven(int num){
        System.out.println((num%2 == 0) ? num/2 : num*2);
    }

    public static String replace(String str, char oldChar, char newChar){
        String newStr = "";
        for (int i = 0; i < str.length() ; i++) {
            char letter = str.charAt(i);
            newStr +=  (letter == oldChar) ? newChar :  letter ;

            /*
            if (letter == oldChar) {
                newStr += newChar;
            } else {
                newStr += letter;
            }
             */

        }
        return newStr;
    }


}


