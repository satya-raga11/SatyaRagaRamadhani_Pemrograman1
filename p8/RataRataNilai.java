package p8;

import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai;
        int total = 0;
        int jumlahData = 0;
        char pilihan;
        
        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();
            
            total += nilai;
            jumlahData++;
            
            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');
        
        double rataRata = (double) total / jumlahData;
        
        System.out.println("Total nilai: " + total);
        System.out.println("Jumlah data: " + jumlahData);
        System.out.println("Rata-rata nilai: " + rataRata);
        
        input.close();
    }
}
