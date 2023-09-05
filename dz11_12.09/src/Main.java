public class Main {
    //Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»


    public static void main(String[] args) {
        String str1 = "Enkoding, kounting";
        char oldChar = 'k';
        char newChar = 'c';
        String replacedStr = replace(str1, oldChar, newChar);
        System.out.println(replacedStr);
    }

    public static String replace(String str, char oldChar, char newChar){
        String newStr = "";
        for (int i = 0; i < str.length() ; i++) {
            char letter = str.charAt(i);
            if (letter == oldChar) {
                newStr += newChar;
            } else {
                newStr += letter;
            }
        }
        return newStr;
    }

   public static String replase(String str, char oldChar, char newChar){
        return  str.replace(oldChar,newChar);
   }
}