package modul7;

import java.util.Scanner;

public class no4for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai koefisen a : ");
        int a = input.nextInt();
        System.out.println("Masukan nilai koefisen b : ");
        int b = input.nextInt();
        System.out.println("Masukan nilai koefisen c : ");
        int c = input.nextInt();

        if (a == 0 ) {
            System.out.println("Nilai koefeisien a tidak boleh 0");
            return;
        }

        double d = Math.pow(b,2) - 4*a*c;

        if (d < 0) {
            double akar1 = (-b + Math.sqrt(d)) / (2*a);
            double akar2 = (-b - Math.sqrt(d)) / (2*a);

            System.out.println("Dari persamaan y = " +a+ "x^2 + " +b+ "x +" +c);
            System.out.println("Akar-akarnya adalah "+akar1+" dan "+akar2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println("-------------------------------------------------------------");
            System.out.println("x\t\ty = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("-------------------------------------------------------------");

            for (double x = akar1; x <= akar2; x += 0.25) {
                double y = a * Math.pow(x, 2) + b * x + c;
                System.out.printf("%f\t%f\n", x, y);

            }
            System.out.println("-------------------------------------------------------------");
            } else {
                System.out.println("Persamaan tidak memiliki dua akar real");
                }
                input.close();
    }

}
