public class Main {
    public static void main(String[] args) {

        //Конъюнкция, логическое И   (& или &&), логическое умножение
        //Выражение истинно только если все входящие в него выражения истинны

        int flask1 = 101;
        int flask2 = 200;
        int flask3 = 50;
        boolean result1 = flask1 > 100 & flask2 > 100 & flask3 > 100;
        System.out.println("The device is working correct - " + result1); //The device is working correct - false



        //Дизъюнкция, логическое ИЛИ ( | или ||), логическое сложение
        //Выражение истинно, если истинно хотя бы одно входящее в него выражение

        boolean result2 = flask1 > 100 | flask2 > 100 | flask3 > 100;
        System.out.println("The device is working correct - " + result2); //The device is working correct - true

        //Строгая дизъюнкция, исключающее ИЛИ (^)
        //Выражение истинно, если истинно только одно входящее в него выражение

        int flask4 = 101;
        int flask5 = 101;
        int flask6 = 90;

        boolean result3 = flask4>100 ^ flask6>100;
        boolean result4 = flask4>100 ^ flask5>100;

        System.out.println("The device is working correct - " + result3); //The device is working correct - true
        System.out.println("The device is working correct - " + result4); //The device is working correct - false

        System.out.println();
    }
}