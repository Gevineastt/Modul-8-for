package modul7;

import java.util.Scanner;

public class no3for {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int a =1, b = 1; // inisialisasi nilai awal
    System.out.println("Deret fibionanci : "); 

    if (n >= 1) {
        System.out.println(a);
    } else if (n >= 2) {
        System.out.println(a + " " + b);
    }


    for (int i = 2; i < n; i++) {
        int jumlah = a + b;
        System.out.println(jumlah + " ");
        a = b;
        b = jumlah;
        }
        
        System.out.println();
        input.close();

}
}
