/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat menghitung rata rata nilai yang di input
 * oleh user
 */
public class PBO310117091Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, nilai[];
        float rata, jumlah = 0;

        //Input banyaknya mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();

        //Inisialisasi array
        nilai = new int[n];

        //Input nilai
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        //Hitung Jumlah
        for (int j = 0; j <= n - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        //Hitung Rata-rata
        rata = jumlah / n;

        //Output
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Dida Handian");
    }
    
}
