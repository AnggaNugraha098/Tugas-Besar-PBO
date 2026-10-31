package Soal5;

import java.util.ArrayList;

public class MainTiket {
    public static void main (String[] args) {
        
        //Membuat ArrayList
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        //Menambahkan tiket pertama
        daftarTiket.add(new Tiket(
            "TK001",
            "Seni Memahami Kekasih",
            "Reguler",
            30000,
            2
        ));

        //Menambahkan tiket kedua
        daftarTiket.add(new Tiket(
            "TK002",
            "Hantu Dalam Sel",
            "Premium",
            60000,
            3
        ));

        //Menambahkan tiket ketiga
        daftarTiket.add(new Tiket(
            "TK003",
            "Purple Heart",
            "VIP",
            80000,
            4
        ));

        //Menampilkan struk pembelian
        System.out.println("=======================");
        System.out.println("      Struk Pembelian Tiket   ");
        System.out.println("================================");

        double totalPembelian = 0;

        //Looping seluruh data tiket
        for (Tiket data : daftarTiket) {
            data.tampilData();
            totalPembelian += data.hitungTotal();
            System.out.println("------------------");
        }

        //Menampilkan total seluruh pembelian
        System.out.println("Total Pembayaran : Rp" + totalPembelian);
        
        System.out.println("=========================================");
        System.out.println("Terima kasih sudah membeli");
        System.out.println("=========================================");
        
    }
    
}
