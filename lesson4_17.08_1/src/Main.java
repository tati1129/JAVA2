public class Main {
    public static void main(String[] args) {

/*
Реализуйте программу, кот считает стоимость покупки, учитывая НДС. Дана стоимость товара и размер НДС(19%).
Программа должна рассчитать, сколько стоит, учитывая налог.
 */
        long price = 12345L; //123.45 UAH
        int taxPercent = 19; //19%
        long tax = calculatePriceWithTax(price, taxPercent);

        System.out.println("Price " + (price / 100.0) + " UAH"); //Price 123.45 UAH
        System.out.println("Tax "+ taxPercent + "% = " + (taxPercent / 100.0) + " UAH"); //Tax 19% = 0.19 UAH
        System.out.println("Total = " + ((price + tax) / 100.0) + " UAH"); //Total = 146.91 UAH

        //Округление до копеек

    }

    public static long calculatePriceWithTax(long price, int taxPercent){
        long taxPrice = taxPercent * price;
        long tax = taxPrice / 100;
        long remainder = taxPrice % 100;

        if (remainder >= 50L){
            return tax + 1L;
        } else if (remainder <= 50L){
            return  tax - 1L;
        }
        return taxPrice;
    }
}