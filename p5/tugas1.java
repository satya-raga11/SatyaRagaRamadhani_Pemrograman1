package p5;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double biayaKuliah, diskon = 0, totalBayar;
        int kategori;

        System.out.println("=== Program Diskon Pembayaran Kuliah ===");
        System.out.print("Masukkan total biaya kuliah: ");
        biayaKuliah = input.nextDouble();

        System.out.println("\nKategori Mahasiswa:");
        System.out.println("1. Tidak mampu");
        System.out.println("2. Berprestasi");
        System.out.println("3. Umum");
        System.out.print("Pilih kategori (1/2/3): ");
        kategori = input.nextInt();

        if (kategori == 1) {
            diskon = 0.5 * biayaKuliah; // 50%
        } else if (kategori == 2) {
            diskon = 0.3 * biayaKuliah; // 30%
        } else if (kategori == 3) {
            diskon = 0.1 * biayaKuliah; // 10%
        } else {
            System.out.println("Kategori tidak valid!");
        }

        totalBayar = biayaKuliah - diskon;

        System.out.println("\n=== Rincian Pembayaran ===");
        System.out.println("Biaya Kuliah : Rp " + biayaKuliah);
        System.out.println("Diskon       : Rp " + diskon);
        System.out.println("Total Bayar  : Rp " + totalBayar);

        input.close();
    }
}