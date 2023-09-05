public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i<3) {
            System.out.println(i);
            i += 1;
        }

        //while и for абсолютно одинаковые циклы, то что можно записать через while можно записать и через for

        for (int j=0; j<3; j++){
            System.out.println(j);
        }
        System.out.println("***********");

        //Дана строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
        //“Java is a very popular language” ->  “Java language”

        String str = ".  Java is the best language! ";


       /* for (int index = 0 ; index < str.length(); index++) {
            System.out.print(str.charAt(index));// .  Java is the best language!
        }

        */

        for (int index = str.length()-1; index >= 0 ; index--) {
            System.out.print(str.charAt(index)); // !egaugnal tseb eht si avaJ  .
        }
        System.out.println(  );

        String string = "Java is the best  language!";
        for (int j = 0; j < string.length(); j+=2) {
            System.out.print(string.charAt(j));
        }
    }
}