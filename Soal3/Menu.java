package Soal3;

public class Menu {
    //deklarasi atribut private
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor tanpa parameter
    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0;
        this.kategori = "-";

    }
    
    // Contrtructor dengan parameter
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;

    }

    // Method Untuk menampilkan menu
    public void tampilMenu() {
        System.out.println("Kode Menu   : " + kodeMenu);
        System.out.println("Nama Menu   : " + namaMenu);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Kategori    : " + kategori);
    }

    //Method untuk menghitung harga
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
