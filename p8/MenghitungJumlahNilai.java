package p8;

import java.util.Scanner;

public class MenghitungJumlahNilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai;
        int total = 0;
        char pilihan;
        
        do {

            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();
            
            // Menambahkan ke total
            total += nilai;
            
            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');
        
        System.out.println("Total nilai mahasiswa: " + total);
        
        input.close();
    }
}
