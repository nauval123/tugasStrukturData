import java.util.Scanner;

public class findNumberOnArray {

    static Integer [] kumpulanbilangan = {2,2,2,2,2,2,2,3,3,4,5,6};
    static int bilangan;
    public static void main(String[] args){

        System.out.println("Masukkan angka yang dicari:");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        bil(in,kumpulanbilangan.length);
        System.out.println(bilangan);

    }

    static void bil(int a, int b){
        if(b>0 ){
            if(a==kumpulanbilangan[b-1]){
                bilangan+= 1;
                bil(a,b-1);
            }
            else {
                bil(a,b-1);
            }
        }
    }
}


