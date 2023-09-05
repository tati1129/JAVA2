import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First level: Реализуйте программу, которая считает стоимость покупки, учитывая НДС. Т.е. дана стоимость товара и размер НДС (например, 19%) Ваша программа должна рассчитать, сколько, сколько вы должны оплатить, учитывая налог.
        Scanner console = new Scanner(System.in);
        System.out.println("Введите цену товара: ");
        double price = console.nextInt();
        double tax = 19.0;
        double taxPercentage = tax/100.0;
        //System.out.println(tax);


        double productTax = taxPercentage * price;
        //System.out.println(product_tax);
        double product_price = productTax + price;


        System.out.println("Стоимость товара включая НДС в размере " + tax + "% : " + product_price + "$");
    }
}