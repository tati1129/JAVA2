public class Main {
    public static void main(String[] args) {
        System.out.println("Second level: ");
        /*
        Second level: Допустим, у вас есть прибор, у которого есть 3 колбы.
        Каждая колба имеет датчик температуры. Считается, что прибор работает правильно,
        если температура в одной из трех колб (не известно в какой) температура более 150 градусов,
        а в остальных менее100 градусов, и при этом сумма температур всех трех колб не превышает 250 градусов.
         */

        int midTemp = 100;
        int lowTemp = 150;
        int summary = 250;

        int flask1 = 155;
        int flask2 = 60;
        int flask3 = 35;


        boolean result1 = (flask1>lowTemp & flask2<midTemp & flask3<midTemp) | (flask2>lowTemp & flask1<midTemp & flask3<midTemp) | (flask3>lowTemp & flask2<midTemp & flask1<midTemp); //true
        boolean result2 = (flask1 + flask2 + flask3)<= summary; //true
        boolean result = result1==true & result2==true;

        System.out.println(result);//true

        if (result == true){
            System.out.println("Система работает правильно (flask)");
        }else {
            System.out.println("Система работает не правильно (flask)");
        }

        System.out.println("---------------------------------------------");
        int colba1 = 150;
        int colba2 = 100;
        int colba3 = 120;

        boolean res1 = (colba1>lowTemp & colba2<midTemp & colba3<midTemp) | (colba2>lowTemp & colba1<midTemp & colba3<midTemp) | (colba3>lowTemp & colba2<midTemp & colba1<midTemp); //true
        boolean res2 = (colba1 + colba2 + colba3)<= summary; //true
        boolean resultColba = res1==true & res2==true;

        System.out.println(res1);


        if (resultColba == true){
            System.out.println("Система работает правильно (colba)");
        }else {
            System.out.println("Система работает не правильно (colba)");
        }
        System.out.println("---------------------------------------------");
        System.out.println("First level: ");
        /*
        First level: Допустим, у вас есть прибор, у которого есть 3 колбы.
        Каждая колба имеет датчик температуры. Считается, что прибор работает
        правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба,
         температура которой более 200 градусов.
         Напишите программу проверки корректности работы такого прибора.
         */
        int flask_1 = 202;
        int flask_2 = 101;
        int flask_3 = 100;

        boolean result_1 = flask_1>=midTemp & flask_2>=midTemp & flask_3>=midTemp;
        boolean result_2 = flask_1>200 | flask_2>200 | flask_3>200;

        boolean ressult = result_1 | result_2;

        if (ressult == true){
            System.out.println("Система работает правильно (flask_)");
        }else {
            System.out.println("Система работает  не правильно (flask_)");
        }
    }

}