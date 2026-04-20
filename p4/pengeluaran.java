package p4;

import java.util.Scanner;

public class pengeluaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int belanja, transportasi, makan, total;

        System.out.println("=== Input Pengeluaran ===");
        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextInt();

        System.out.print("Masukkan pengeluaran transportasi: ");
        transportasi = input.nextInt();

        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextInt();

        total = belanja + transportasi + makan;

        System.out.println("\n=== Ringkasan Pengeluaran ===");
        System.out.println("Belanja       : Rp " + belanja);
        System.out.println("Transportasi  : Rp " + transportasi);
        System.out.println("Makan         : Rp " + makan);
        System.out.println("-----------------------------");
        System.out.println("Total         : Rp " + total);

        input.close();
    }
}
