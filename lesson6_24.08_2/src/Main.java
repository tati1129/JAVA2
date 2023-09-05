public class Main {
    public static void main(String[] args) {

        boolean flag1 = false;
        boolean flag2 = false;

        boolean condition = flag1 && flag2; //false

        if (condition) { //false
            System.out.println("A");
        } else {
            System.out.println("D"); //D
        }
        System.out.println("C"); //C
    }
}