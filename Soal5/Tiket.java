package Soal5;

public class Tiket {

    //Deklarasi atribut private
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    //Constructor
    public Tiket(String kodeTiket, String namaFilm, String jenisTiket, double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;

    }

    //Method untuk menampilkan data tiket

    public void tampilData() {
        System.out.println("Kode Tiket     : " + kodeTiket);
        System.out.println("Nama Film      : " + namaFilm);
        System.out.println("Jenis Tiket    : " + jenisTiket);
        System.out.println("Harga Tiket    : Rp" + hargaTiket);
        System.out.println("Junmlah Tiket  : " + jumlahTiket);
        System.out.println("Total          : Rp" + hitungTotal());
    }

    //Method untuk menghitung total harga
    public double hitungTotal(){
        return hargaTiket * jumlahTiket;

    }
    
}
