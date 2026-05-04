package p7;

import java.util.Scanner;

public class tugasp7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pertemuan: ");
        int totalPertemuan = input.nextInt();
        System.out.print("Masukkan jumlah kehadiran: ");
        int hadir = input.nextInt();

        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();

        double persentaseKehadiran = (double) hadir / totalPertemuan * 100;

        System.out.println("\nPersentase Kehadiran: " + persentaseKehadiran + "%");

        if (persentaseKehadiran < 75) {
            System.out.println("Status: Tidak Lulus (Kehadiran kurang dari 75%)");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);

            System.out.println("Nilai Akhir: " + nilaiAkhir);

            if (nilaiAkhir >= 85) {
                System.out.println("Grade: A");
            } else if (nilaiAkhir >= 70) {
                System.out.println("Grade: B");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Grade: C");
            } else if (nilaiAkhir >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }

            System.out.println("Status: Lulus");
        }

        input.close();
    }
}