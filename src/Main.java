import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("masukkan jumlah bilangan:");


        System.out.println("masukkan bilangan faktorial:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int hasilakhir = rekursif(i);
        System.out.println(hasilakhir);
    }

    static int rekursif (int i){
        int j = i;
        if ( j == 0 || j ==1 ){
            return 1;
        }else {
            int hasil = j*rekursif(j-1);
            System.out.println(hasil);
            return hasil;
        }
    }
}


