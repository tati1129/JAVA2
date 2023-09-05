public class Main {
    public static void main(String[] args) {

        System.out.println("1.");
        //1.Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
        //“Java is a very popular language” ->  “Java language”
        //String str = "    Java is a very popular language   ";
        String str = "    Java  ";

        String firstWord = "";
        String lastWord = "";
        String newStr = "";

        int index = 0;


        //Пропускаем пробелы в начале слова если есть
        for ( ;index<str.length() && str.charAt(index) == ' '; index++){
        }

        //Формируем 1е слово
       for ( ; index<str.length() && str.charAt(index)!= ' '; index++) {
            firstWord += str.charAt(index);
        }


        //Пропускаем пробелы в конце строки если есть
        index=str.length()-1;
        for ( ; index>=0 && str.charAt(index) == ' '; index--){
        }

        //Формируем последнее слово
        for ( ;index>=0 && str.charAt(index) != ' '; index--){
            lastWord = str.charAt(index) + lastWord;
        }
        //Создаем новую строку

        if (firstWord != "" && lastWord != ""){
            System.out.println(firstWord + " " + lastWord);
        }else {
            System.out.println(firstWord);
        }

        System.out.println("2.");

        //2)      Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex  «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.  Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
        //“Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
        //“Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
        //“Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”

        int startIndex = 5;
        int endIndex = 13;
        String str2="Java is a very popular language";
        String result = "";

        if (startIndex>=str2.length() || startIndex>=endIndex || endIndex<0){
            System.out.println("error");
        }else {
            result = "" + str2.charAt(startIndex);//Если всего 1 символ, чтоб он заведома попал в нов строку
            for (int i =startIndex+1; i < str2.length() && i<endIndex; i++) {//сдвигаем на 1 : startIndex+1
                result += str2.charAt(i);
            }
        }

        System.out.println(result);
        System.out.println( );
        System.out.println("3. таблица Пифагора");
        //3. Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора). Естественно, использовать циклы.
        //  1   2   3   4   5   6   7   8   9
        //  2   4   6   8   10  12  14  16  18
        //  3   6   9   12  15  18  21  24  27
        //  4   8   12  16  20  24  28  32  36
        //  5   10  15  20  25  30  35  40  45
        //  6   12  18  24  30  36  42  48  54
        //  7   14  21  28  35  42  49  56  63
        //  8   16  24  32  40  48  56  64  72
        //  9   18  27  36  45  54  63  72  81


        int row = 9;
        int col = 9;

        System.out.print("   | ");
        for (int j = 1; j <= col ; j++) {
            System.out.printf("%4d",j);
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 1; i <= row; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 1; j <= col; j++) {
                System.out.printf("%4d", i * j); // Используем форматированный вывод для выравнивания
            }
            System.out.println(); // Переход на новую строку после каждой строки
             // Переход на новую строку после каждой строки
        }

        //2й вариант
        int numX = 1;
        int numY = 1;

        while (numX <10){
            if (numX < 10 && numY < 10){
                int res = numX * numY;
                System.out.printf("%5d", res);
                numY++;
            }else {
                System.out.println();
                numX++;
                numY = 1;
            }
        }
    }
}