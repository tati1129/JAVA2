public class Main {
    public static void main(String[] args) {

        int flask1 = 100;
        int flask2 = 200;

        if (flask1>flask2){
            System.out.println("flask1 is hot");
        } else if (flask1==flask2){
            System.out.println("flask2 and flask2 are hot");
        } else  {
            System.out.println("flask2 is hot");
        }

        System.out.println("------------------------------------------------");

        String lang = "ua";

        if (lang == "ua"){
            System.out.println("Привiт! " + "lang is \"" + lang +  "\"");
        } else {
            if (lang == "de"){
                System.out.println("Hallo! " + "lang is \"" + lang + "\"");
            } else {
                System.out.println("Hello! " + "lang is \"" + lang + "\"");
            }
        }
        System.out.println("finish");

        System.out.println("-----------------------------------------------");

        //Другая форма записи краткая
        if (lang.equals("ua")){
            System.out.println("Привiт! " + "lang is \"" + lang +  "\"");
        }
        if (lang == "de"){
            System.out.println("Hallo! " + "lang is \"" + lang + "\"");
        }
        if (lang!="ru" && lang!="de"){
            System.out.println("Hello! " + "lang is \"" + lang + "\"");
        }
    }


}