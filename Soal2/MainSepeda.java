package Soal2;

public class MainSepeda {
    public static void main(String[] args) {

        //Membuat object sepeda pertama
        Sepeda sepeda1 = new Sepeda(
            "SP001",
            "Sepeda Gunung",
            3,
            15000
        );
        
        //Membuat object sepeda kedua
        Sepeda sepeda2 = new Sepeda(
            "SP002",
            "Sepeda Lipat",
            5,
            10000
        );

        //Menampilkan data sepeda pertama
        System.out.println("===== Data Sewa Sepeda =====");
        System.out.println("\nData Sepeda 1");
        sepeda1.tampilData();
     
        System.out.println("Total Biaya Sewa : Rp " + sepeda1.hitungBiayaSewa());
        System.out.println("\nData Sepeda 2");
        sepeda2.tampilData();
       
        System.out.println("Total Biaya Sewa : Rp " + sepeda2.hitungBiayaSewa());
        System.out.println("\n==============================");

        
    }
    
}
