/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_3a;

/**
 *
 * @author AbitCom.Store
 */

import java.util.Scanner;

public class post_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        double total = 0;

        System.out.print("Jumlah Mahasiswa: ");
        jumlah = input.nextInt();
        input.nextLine();

        String mahasiswa[][] = new String[jumlah][6];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM          : ");
            mahasiswa[i][0] = input.nextLine();

            System.out.print("Nama         : ");
            mahasiswa[i][1] = input.nextLine();

            System.out.print("Nilai Tugas  : ");
            double tugas = input.nextDouble();

            System.out.print("Nilai UTS    : ");
            double uts = input.nextDouble();

            System.out.print("Nilai UAS    : ");
            double uas = input.nextDouble();
            input.nextLine();

            double akhir = (tugas + uts + uas) / 3;

            mahasiswa[i][2] = String.valueOf(tugas);
            mahasiswa[i][3] = String.valueOf(uts);
            mahasiswa[i][4] = String.valueOf(uas);
            mahasiswa[i][5] = String.format("%.2f", akhir);

            total += akhir;
        }

        System.out.println("\n========== DATA NILAI MAHASISWA ==========");
        System.out.printf("%-4s %-15s %-15s %-8s %-8s %-8s %-10s%n",
                "No", "NIM", "NAMA", "TUGAS",
                "UTS", "UAS", "AKHIR");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-15s %-15s %-8s %-8s %-8s %-10s%n",
                    i + 1,
                    mahasiswa[i][0],
                    mahasiswa[i][1],
                    mahasiswa[i][2],
                    mahasiswa[i][3],
                    mahasiswa[i][4],
                    mahasiswa[i][5]);
        }

        System.out.printf("\nRata-rata Nilai Akhir: %.2f%n",
                total / jumlah);

        input.close();
    }
}

