public class Main {
    public static void main(String[] args) {

        MyDate newYear = new  MyDate(1, 1, 2023);
        MyDate today = new MyDate(5,7,2023);

        newYear.print();
        today.print();
    }
}

class  MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void print(){
        System.out.println(day+"-"+month+"-"+year);
    }
}