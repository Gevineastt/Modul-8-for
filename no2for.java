package modul7;

import java.util.Scanner;

public class no2for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menginput jumlah data dari user 
        System.out.println("Masukan jumlah data: ");
        int N = input.nextInt();

        //variable untuk menyimpan hasil perhitungan 
        double jumlahKuadrat = 0;
        double jumlahAkar = 0;
        double jumlahKebalikan = 0;

        //menginput dan memulai perhitungan data dalam satu loop
        System.out.println("Masukan " + N + "data :");
        for (int i = 1; i <= N; i++) {
            double data = input.nextDouble();

            // a. jumlah kuadrat data 
            jumlahKuadrat += Math.pow(data, 2);

            // b. jumlah akar data 
            jumlahAkar += Math.sqrt(data);

            // c. jumlah 1/data untuk data yang tidak sama dengan no;
            if (data != 0) {
                jumlahKebalikan += 1 / data;
            }
        }

        System.out.println("\nHasil Perhitungan:");
        System.out.printf("a) Jumlah Kuadrat Data: %.2f\n", jumlahKuadrat);
        System.out.printf("b) Jumlah Akar Data: %.2f\n", jumlahAkar);
        System.out.printf("c) Jumlah 1/Data (untuk data != 0): %.2f\n", jumlahKebalikan);
        
        input.close();
    }
}
