package Soal1;
public class Buku{

    //Deklarasi atribut
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    // Constructor
    public Buku(String kodeBuku, String judul, String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga= harga;

    }

    // Method untuk menampilkan data buku
    public void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("---------------------------");
    }
}