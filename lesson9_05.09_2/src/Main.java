//Работа со строкой, длина строки, индекс символов, заглавные, строчные литеры

public class Main {
    public static void main(String[] args) {
        String str = "Hello java!";
        System.out.println(str); //Hello java!
        System.out.println(str.length()); //11 длина строки
        System.out.println(str.toLowerCase()); //hello java!
        System.out.println(str.toUpperCase()); //HELLO JAVA!
        str = str.toUpperCase();// сохранение строки заглавными буквами

        System.out.println(str);//HELLO JAVA!

        System.out.println(str.charAt(1)); //выводит символ строки под индексом 1 - E


        System.out.println("****************");
        int index = 0;
        while (index<str.length()){
            System.out.println(str.charAt(index));//выводит по 1 символу в столбик по индексу строки
            index+=1;
        }
        System.out.println("Hello world!");

        System.out.println("****************");
        //вывести в столбик строку реверсом
        int index1 = (str.length()-1);
        while (index1>=0){
            System.out.println(str.charAt(index1));
            index1-=1;
        }

        System.out.println("****************");
        //вывести и сохранить строку реверсом
        int index2 = (str.length()-1);
        String str2 ="";
        while (index2>=0){
            str2+=str.charAt(index2);
            index2-=1;
        }
        System.out.println(str2);

        System.out.println("****************");
        //удалить пробел из строки

        String strWithoutSpace ="";
        int ind = 0;
        while (ind<str.length()){
            char ch = str.charAt(ind);
            if (ch!=' '){// одинарные ковычек потомучто это charAt там хранится число, это примитивный тип данных
                strWithoutSpace+=ch;
            }
            ind+=1;
        }
        System.out.println(strWithoutSpace);
    }
}