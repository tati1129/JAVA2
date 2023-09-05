public class Main {
    public static void main(String[] args) {

        int i = 1;

        while (i<5){
            i=i+1;
            System.out.println(i);
            i=i+1;
        }
        System.out.println("after  " + i);

        /*
        2
        4
        after  5
         */

        while (i<5){
            i=i+1;
            System.out.println(i);
        }
        System.out.println("after  " + i);

        /*
        2
        3
        4
        5
        after  5
         */

        int a = 1;
        int k = 1;
        while (a<5){
            while (k<3){
                System.out.println(a);
                k=k+1;
            }
            a=a+1;
        }
        System.out.println("after  " + a);

        /*
        1
        1
        after  5
         */
        System.out.printf("*********************%n %n");

        System.out.println("Цикл в цикле: ");
        int x = 1;
        int y = 1;
        while (x<5){
            y=0;
            while (y<3){
                System.out.println(" x = " +x+ " y = "+y);
                y=y+1;
            }
            System.out.println("-------------");
            x=x+1;
        }

        /*
        Цикл в цикле:
         x = 1 y = 0
         x = 1 y = 1
         x = 1 y = 2
        -------------
         x = 2 y = 0
         x = 2 y = 1
         x = 2 y = 2
        -------------
         x = 3 y = 0
         x = 3 y = 1
         x = 3 y = 2
        -------------
         x = 4 y = 0
         x = 4 y = 1
         x = 4 y = 2
        -------------
         */

    }
}