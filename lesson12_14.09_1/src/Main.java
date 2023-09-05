public class Main {
    public static void main(String[] args) {

        String str = "Hello world!";
        System.out.println(str);


        System.out.println("str.length() : " + str.length());
        System.out.println("str.charAt(0) : " + str.charAt(0));
        System.out.println("str.toLowerCase() : " + str.toLowerCase());
        System.out.println("str.toUpperCase() : " + str.toUpperCase());
        System.out.println("str.replace('l', 'L') : " + str.replace('l', 'L'));
        System.out.println("str.replace(\"world\", \"All\") : " + str.replace("world", "all"));
        System.out.println("str.indexOf(\"world\") : " + str.indexOf("world"));
        System.out.println("str.indexOf(\"all\") : " + str.indexOf("all"));// -1
        System.out.println("str.indexOf(\"l\") : " + str.indexOf("l")); // выводит позицию, не индекс // 2
        System.out.println("str.indexOf(\"l\", 4) : " + str.indexOf("l", 4)); // выводит позицию, после 4й позиции не индекс // 9
        System.out.println("str.indexOf(\"l\", 10) : " + str.indexOf("l", 10)); // выводит позицию, после 5й позиции не индекс // -1

        //поиск подстроки, 1й индекс должен входить в интервал, 2й нет
        System.out.println("str.substring(6, 11) : " + str.substring(6, 11));
        System.out.println("str.substring(str.indexOf(\"world\"), 11) : " + str.substring(str.indexOf("world"), 11));

        String s1 = "Hello";
        int s = (str.indexOf(s1) + s1.length());
        System.out.println(s);
        System.out.println("str.substring(str.indexOf(s1),str.indexOf(s1) + s1.length()) :" + str.substring(str.indexOf(s1), str.indexOf(s1) + s1.length()));

        // метод .substring() можно вызывать с одним аргументом, начало строки, тогда получаем до конца строки, а не до 2й позиции
        System.out.println("str.substring(6) : " + str.substring(6)); // world!

        // метод .trim() - убирает пробелы в начале и в конце строки
        System.out.println("str.trim() : " + str.trim()); //

        // метод .startsWith() - позволяет определить начинается ли строка с указанной подстроки(в аргументе)
        System.out.println("str.startsWith(\"He\") : "+ str.startsWith("He")); // true
        System.out.println("str.startsWith(\"Me\") : "+ str.startsWith("Me")); // false

        // метод .endsWith() - позволяет определить заканчивается ли строка указанной подстрокой(в аргументе)
        System.out.println("str.endsWith(\"!\") : "+ str.endsWith("!")); // true
        System.out.println("str.endsWith(\".\") : "+ str.endsWith(".")); // false

        // метод .equals() - позволяет сравнить строки, в качестве параметров задаем строку, кот сравниваем
        System.out.println("str.equals(\"Hello world!\") : " + str.equals("Hello world!")); // true


        // метод - позволяет сравнить строки, игнорируя регистр
        System.out.println("str.equalsIgnoreCase(\"heLLo worLd!\") : " + str.equalsIgnoreCase("heLLo worLd!")); //  true
    }



}