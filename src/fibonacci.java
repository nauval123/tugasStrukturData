import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("masukkan bilangan fibonacci:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j=0;j<i;j++){
            int hasilakhir =fibon(j);
            System.out.println(hasilakhir);
        }

    }

    static int fibon(int a){
        if(a == 0){
            return 0;
        }if(a == 1   ){
            return 1;
        }
        return  fibon(a-1)+fibon(a-2);
    }
}
