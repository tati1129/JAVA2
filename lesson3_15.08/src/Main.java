public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = a + 5;
        int c = a;
        a = b;

        System.out.println(a+b+c); //40 (15+15+10)

        a = 10;
        b = b+1;

        System.out.println(a+b+c); //36 (10+16+10)


        int a1 = 10;
        int b1 = a; //10;
        int c1 = a1; //10
        a1 = b1*10 + c1*10; //200
        System.out.println(a1+b1+c1); //220

        c1 = a1; //200
        a1 = b1; //10

        double a2 = 10;
        //int b2 = a2 - 5; не правильная запись
        double b2 = a2 - 5;
        double c2 = a2*b2;
        System.out.println(a2 + "*" + b2 + "=" + c2); // 10.0*5.0=50.0
    }
}