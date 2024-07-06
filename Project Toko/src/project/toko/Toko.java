package project.toko;

public class Toko {
    
//    Atribut
    private String namaBarang;
    private int stokBarang;

//    Konstruktor Kosong
    public Toko() {

    }
//    Kosntruktor Polymophism (Overloading)
    public Toko(String namaBarang, int stokBarang) {
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }
    
//    Accsessor
    protected String getnamaBarang() {
        return namaBarang;
    }

    protected int getStokBarang() {
        return stokBarang;
    }

//    Mutator
    protected void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    protected void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }


    String getInfo() {
        return "barang " + getnamaBarang() + " dengan stok " + getStokBarang();
    }
}


//1. Class 
//2. Object 
//3. Atribut 
//4. Constructor 
//5. Mutator 
//6. Accessor 
//7. Encapsulation 
//8. Inheritance 
//9. Polymophism 
//10. Seleksi
//11. Perulangan
//12. IO Sederhana 
//13. Array 
//14. Error Handling
