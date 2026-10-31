package Soal4;

public class Pemeriksaan {

    //Deklarasi atribut private
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    //Contructor
    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;

    }
    
    //Method untuk menampilkan data
    public void tampilData() {
        System.out.println("No Pemeriksaan   : " + noPemeriksaan);
        System.out.println("Nama Pasien      : " + namaPasien);
        System.out.println("Nama Dokter      : " + namaDokter);
        System.out.println("Biaya Pemeriksaan: Rp" + biayaPemeriksaan);

    }

    //Method untuk menghitung Biaya
    public double hitungTotal() {
        return biayaPemeriksaan;
        
    }
}
