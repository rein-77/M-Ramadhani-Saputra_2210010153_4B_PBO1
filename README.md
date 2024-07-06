# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Toko {
    ...
}

public class StokToko extends Toko {
    ...
}

public class TokoMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Toko stokBaru = new Toko();` adalah contoh pembuatan object.

```bash
Toko stokBaru = new Toko();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaBarang` dan `stokBarang` adalah contoh atribut.

```bash
String namaBarang;
int stokBarang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Toko` dan `StokToko`.

```bash
public Toko(String namaBarang, int stokBarang) {
    this.namaBarang = namaBarang;
    this.stokBarang = stokBarang;
    }


public Toko() {

    }

public StokToko(String namaBarang, int stokBarang) {
    super(namaBarang, stokBarang);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaBarang` dan `setStokBarang` adalah contoh method mutator.

```bash
protected void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
}

protected void setStokBarang(int stokBarang) {
    this.stokBarang = stokBarang;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getnamaBarang`, `getStokBarang`, `getKapasitasStok` adalah contoh method accessor.

```bash
protected String getnamaBarang() {
    return namaBarang;
}

protected int getStokBarang() {
    return stokBarang;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaBarang;
private int stokBarang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `StokToko` mewarisi `Toko` dengan sintaks `extends`.

```bash
public class StokToko extends Toko {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `getInfo()` di `Toko` merupakan overloading method `getInfo` dan `getInfo()` di `StokToko` merupakan override dari method `getInfo()` di `Toko`.

```bash
String getInfo() {
    return "barang " + getnamaBarang() + " dengan stok " + getStokBarang();
}

@Override
String getInfo() {
    return super.getInfo() + " dan " + getKapasitasStok();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKapasitasStok`.

```bash
String getKapasitasStok() {
    if (getStokBarang() >= 100) {
        return "Stok Barang Cukup";
    } else {
        return "Stok Barang kurang";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < stokArray.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukan Nama Barang: ");
String namaBarang = scanner.nextLine();
System.out.print("Masukan Jumlah Barang: ");
int stokBarang = scanner.nextInt();

System.out.println("\n Stok yang telah dimasukan : ");
System.out.println(stok1.getInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `StokToko[] stokArray = new StokToko[1];` adalah contoh penggunaan array.

```bash
StokToko[] stokArray = new StokToko[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Errornya Adalah: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Edya Rosadi
NPM: 2110010001
