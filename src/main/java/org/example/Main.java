package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 2;// Deklarasi variabel 'x'
        int y = 2;
        double w = 2.5;   // Deklarasi variabel 'w' dengan nilai awal 2.5
        double z = 2;

        String nama = "John";  // Deklarasi variabel 'nama' dengan nilai awal "John"

        int hasil = x + y;       // Penjumlahan 'x' dan 'y', lalu hasilnya disimpan di 'hasil'
        double bagi = w / z;     // Pembagian 'y' dengan 'x', lalu hasilnya disimpan di 'bagi'

        final double PI= 3.14;  // deklarasi konstanta

        System.out.println(nama);
        System.out.println(hasil);
        System.out.println(bagi);

        if (hasil > 50) {
            System.out.println("Nilai lebih dari 50");
        } else {
            System.out.println("Nilai 50 atau kurang");
        }
    }
}
