import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1) Представьте, что вы пишите программу для онлайн кинотеатра. У вас известно возрастное ограничение фильма и возраст клиента (естественно заданы в виде переменных). Ваша программа должна выдавать на экран: «вы можете смотреть этот фильм» или «данный контент вам не доступен»


*/

        System.out.println("1.------------------------------------------------");
        System.out.println("Введите Ваш возраст, затем нажмите кнопку enter");

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age>18){
            System.out.println("Bы можете смотреть этот фильм");
        }else {
            System.out.println("Данный контент вам не доступен");
        }

        System.out.println("2.-----------------------------------------------------");

        /*
        2) Представьте, Вы пишите программу для расчета штрафов за превышение скорости. В качестве исходных данных у вас: ограничение скорости на данном участке дороги, скорость, с которой двигался автомобиль и признак того, что нарушение было совершено на автобане. Естественно, все три значения заданы переменными. Таблица штрафов такая:
        - превышение менее 10% от скоростного ограничения – не штрафуется
        - 10% - менее 20%   от скоростного ограничения – 50 евро
        - 20% - менее 30%   от скоростного ограничения – 150 евро не на автобане, и 200 на автобане
        - от 30% и выше - 500 евро плюс, если нарушение на автобане, лишение прав на 3 месяца.
        Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран.
         */

        //Вводные данные
        int speedLimit = 100;
        int fixedSpeed = 119;
        boolean autobahn = true;

        String penaltyNo = "Предупреждение превышения скорости";
        String penalty = "штраф - %d евро  %n";
        String canselLic = " с лишением прав на %d месяца";

        //Решение
        int speedOver = fixedSpeed*100/speedLimit - 100;
        int fine = 0;
        int canselLicense = 0;

        if (speedOver<10){
            fine = 0;
        }else if (speedOver>=10 && speedOver<20){
            fine=50;
        }else  if (speedOver>=20 && speedOver<30){
            if (autobahn){
                fine=200;
            }else {
                fine=150;
            };
        }else  if (speedOver>=30){
            fine=500;
            if (autobahn) {
                canselLicense=3;
            };
        }

        //Вывод на экран
        if (fine!=0){
            System.out.printf(penalty,fine);
            if (canselLicense!=0){
                System.out.printf(canselLic, canselLicense);
            }
        }else {
            System.out.println(penaltyNo);
        }
    }
}