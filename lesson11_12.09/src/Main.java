//Методы

public class Main {
    public static void main(String[] args) {

        double a = 10;
        double b = 15.3;
      //  double add(имя переменной) = add(a, b)(метод и параметры);
        double add = add(a, b); //25.30
        System.out.println(add(10,20)); // 30
        add(add(a,b), 20); // add(add(10, 15.3), 20); =>  45,3
        System.out.printf("%.2f + %.2f = %.2f", a, b, add); // 25,3
    }

// double - тип- результат работы, add -имя, (double a, double b) - параметры
    // сигнатура метода
    public static double add(double a, double b){
        double res = a + b;
        return res;
    }


}