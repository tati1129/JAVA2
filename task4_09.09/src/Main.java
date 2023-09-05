public class Main {
    public static void main(String[] args) {

       countCube(0, 5, "Finished");
       pifagor(20);

        System.out.println( );

        int a = countSum(1,5);
        //System.out.println(countSum(1,5));
        System.out.println(a);
    }

    public  static void countCube(int i, int n, String str){

        while (i<=n){
            System.out.println(i*i*i);
            i++;
        }
        System.out.println(str);
    }


    public  static void pifagor(int n){

        for (int j=1; j<=n; j++){
            for (int k =1; k<=n; k++){
                System.out.printf( " %4d ",j*k );
            }
            System.out.println();
        }
    }


    public static int countSum(int start, int end){
//public static "int" countSum - чтоб метод вернул, пишем тип данных кот возвращает, и внизу метода обязательно прописываем return для возврата
        int sum=0;
        while (start<=end){
            sum=sum+start;
            start++;
        }
         return sum;
    }
}