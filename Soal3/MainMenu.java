package Soal3;

public class MainMenu {

    public static void main(String[] args) {
        
        //Object pertama menggunakan contructor tanpa parameter
        Menu menu1 = new Menu();

        //Object kedua menggunakan contructor dengan parameter
        Menu menu2 = new Menu(
            "M001",
            "Nasi Goreng",
            10000,
            "Makanan"
        );
        
        //Object ketiga
        Menu menu3 = new Menu(
            "M002",
            "Es Jeruk",
            7000,
            "Minuman"
        );

        //Menampilkan data Menu 1 Menu 2 dan Menu 3
        System.out.println("===== SISTEM MENU KAFE ====");

        System.out.println("\nData Menu 1");
        menu1.tampilMenu();
        System.out.println("Jumlah Pesanan : 1");
        System.out.println("Total Harga    : Rp" + menu1.hitungHarga(1));
        
        System.out.println("\nData Menu 2");
        menu2.tampilMenu();
        System.out.println("Jumlah Pesanan : 2");
        System.out.println("Total Harga    : Rp " + menu2.hitungHarga(2));

        System.out.println("\nData Menu 3");
        menu3.tampilMenu();
        System.out.println("Jumlah Pesanan : 3");
        System.out.println("Total Harga    : Rp " + menu3.hitungHarga(3));

        System.out.println("\n==========================");


    }
    
}
