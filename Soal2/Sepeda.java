package Soal2;

public class Sepeda {

    //Deklarasi atribut private
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    //Constructor
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    //Method untuk menampilkan data sepeda
    public void tampilData() {
        System.out.println("Kode Sepeda    : " + kodeSepeda);
        System.out.println("Jenis Sepeda   : " + jenisSepeda);
        System.out.println("Lama Sewa      : " + lamaSewa + " Jam");
        System.out.println("Harga/Jam      : Rp " + hargaPerJam);
    }

    //Method untuk menghitunh biaya sewa sepeda
    public double hitungBiayaSewa() {
        return lamaSewa * hargaPerJam;

    }
}
