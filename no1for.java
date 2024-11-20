package modul7;

import java.util.Scanner;

public class no1for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // menginput jumlah resistor sesuai dari user 
        System.out.print("Masukkan jumlah tahanan (N): ");
        int N = input.nextInt();

        // Memilih tipe penyusunan
        System.out.println("Pilih susunan tahanan:");
        System.out.println("1 - Seri");
        System.out.println("2 - Paralel");
        System.out.print("Masukkan pilihan Anda (1/2): ");
        int pilihan = input.nextInt();

        double totalResistance = 0;

        if (pilihan == 1) {
            // Menghitung total resistansi untuk seri
            for (int i = 1; i <= N; i++) {
                System.out.print("Masukkan nilai tahanan ke-" + i + ": ");
                double resistor = input.nextDouble();
                totalResistance += resistor;
            }
            System.out.println("Total tahanan untuk susunan seri adalah: " + totalResistance + " ohm");
        } else if (pilihan== 2) {
            // Menghitung total resistansi untuk paralel
            double total= 0;
            for (int i = 1; i <= N; i++) {
                System.out.print("Masukkan nilai tahanan ke-" + i + ": ");
                double resistor = input.nextDouble();
                total += 1 / resistor;
            }
            totalResistance = 1 / total;
            System.out.println("Total tahanan untuk susunan paralel adalah: " + totalResistance + " ohm");
        } else {
            System.out.println("Pilihan tidak valid. Harap masukkan 1 untuk seri atau 2 untuk paralel.");
        }

        input.close();
    }

    }


