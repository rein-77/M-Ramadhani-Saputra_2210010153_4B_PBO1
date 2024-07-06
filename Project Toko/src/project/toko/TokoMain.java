package project.toko;

import java.util.Scanner;

public class TokoMain {

    public static void main(String[] args) {
        
        Toko stokBaru = new Toko();
        stokBaru.setStokBarang(300);
         stokBaru.setNamaBarang("Kopiko");
         System.out.println(stokBaru.getInfo());
        // Error Handling menangkap eror
        try {
            Scanner scanner = new Scanner(System.in);

//        array
            StokToko[] stokArray = new StokToko[3];

//        Perulangn for loop
            for (int i = 0; i < stokArray.length; i++) {

                // Input
                System.out.println("Input barang di TOKO");
                System.out.print("Masukan Nama Barang: ");
                String namaBarang = scanner.nextLine();
                System.out.print("Masukan Jumlah Barang: ");
                int stokBarang = scanner.nextInt();
                scanner.nextLine();

                stokArray[i] = new StokToko(namaBarang, stokBarang);
            }

            System.out.println("\n Stok yang telah dimasukan : ");
//        perulangan dan output
            for (StokToko stok1 : stokArray) {
                System.out.println(stok1.getInfo());
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Errornya Adalah: " + e.getMessage());
        }
    }
}
