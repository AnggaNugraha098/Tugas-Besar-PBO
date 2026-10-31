package Soal4;

import java.util.ArrayList;

public class MainPemeriksaan {
    public static void main(String[] args) {

        //Membuat ArrayList
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        //Menambahkan data pemeriksaan pertama
        daftarPemeriksaan.add(new Pemeriksaan(
        "PK001",
        "Angga Nugraha",
        "Dr. Bagas",
        150000
    ));

        //Menambahkan data pemeriksaan kedua
        daftarPemeriksaan.add(new Pemeriksaan(
            "PK002",
            "Patika Sari Dewi",
            "Dr. Bagas",
            30000
        ));

        //Menambahkan data pemeriksaan ketiga
        daftarPemeriksaan.add(new Pemeriksaan(
            "PK003",
            "Saefudin",
            "Dr. Ancika",
            50000
        ));

        //Menampilkan seluruh data menggunakan looping
        System.out.println("===== SISTEM PEMERIKSAAN KLINIK =====");

        double totalSeluruhBiaya = 0;

        for (Pemeriksaan data : daftarPemeriksaan) {
            System.out.println("\nData Pemeriksaan");
            data.tampilData();
            System.out.println("Total Biaya      : Rp" + data.hitungTotal());
            totalSeluruhBiaya += data.hitungTotal();
            System.out.println("-----------------------------------------");
        }

        //Menampilkan total seluruh biaya
        System.out.println("\nTotal Seluruh Biaya  : Rp" + totalSeluruhBiaya);
        System.out.println("================================================");
        

    }
    
}
