package Soal1;

public class MainBuku {
    public static void main(String[]args){
        //Membuat objek buku pertama
        Buku buku1 = new Buku(
            "BK001",
            "Belajar Java",
            "Angga Nugraha",
            85000
        );

        //Membuat object buku kedua
        Buku buku2 = new Buku(
            "BK002",
            "Pemrograman OOP",
            "Patika",
            95000
        );
    
        //Menampilkan data buku
        System.out.println("==== Data INVENTORY BUKU ====");
        buku1.tampilData();
        buku2.tampilData();

    }
    
    
}
