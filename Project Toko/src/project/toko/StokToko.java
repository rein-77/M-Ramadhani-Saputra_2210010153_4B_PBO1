package project.toko;

//    inheritance
public class StokToko extends Toko {

    public StokToko(String namaBarang, int stokBarang) {
        super(namaBarang, stokBarang);
    }
    
//        Seleksi
    String getKapasitasStok() {
        if (getStokBarang() >= 100) {
            return "Stok Barang Cukup";
        } else {
            return "Stok Barang kurang";
        }
    }

//    Polymophisme 
    @Override
    String getInfo() {
        return super.getInfo() + " dan " + getKapasitasStok();
    }
}
