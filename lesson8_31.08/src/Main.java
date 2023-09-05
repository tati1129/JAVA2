public class Main {
    public static void main(String[] args) {
        //num*=3; => num=num*3;
        //num/=3; => num=num/3;
        //num+=3; => num=num+3;
        //num-=3; => num=num-3;


 //Посчитать сумму четных чисел от num1 до num2
        int num1 = 2;
        int num2 = 6;
        long sum = 0;

        if (num1%2!= 0)  num1=num1+1;
            while (num1<=num2){
                    sum = sum + num1;
                    num1=num1+2; // num1+=2;
        }

        System.out.println("Сумма: "  + sum);
            //
   //Посчитать степень b числа a

   int a = 2;
   int b = 6;

   long res = 1; // число в нулевой степени=1;

   int i = 0; //нулевая степень
        while (i<b){
            res = res * a;
            i+=1; // i=i+1;
        }
        System.out.printf("%d^%d=%d", a, b, res);

        //System.out.printf("%d^%d=%f %n", a, b, Math.pow(a,b));// %f- потому что Math.pow(a,b) выдает doble; простая запись с оператором  Math.pow()
    }
}
