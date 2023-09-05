public class Main {
    public static void main(String[] args) {
        //Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
        //“Java is a very popular language” ->  “Java language”

        String str = "    Java is a very popular language   ";

        String firstWord = "";
        String lastWord = "";
        String newStr = "";

        int index = 0;


        //Пропускаем пробелы в начале слова если есть
        while (index<str.length() && str.charAt(index) == ' '){
            index++;
        }

         //Формируем 1е слово
        while (index<str.length() && str.charAt(index)!= ' ') {
            firstWord += str.charAt(index);
            index += 1;
            }


        //Пропускаем пробелы в конце строки если есть
        index=str.length()-1;
        while (index>=0 && str.charAt(index) == ' '){
            index--;
        }

        //Формируем последнее слово
        while (index>=0 && str.charAt(index) != ' '){
            lastWord = str.charAt(index) + lastWord;
            index--;
        }
        //Создаем новую строку
        newStr=firstWord + " " + lastWord;


        System.out.println(newStr);
    }
}