# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data koleksi perpustakaan kampus (Buku dan Skripsi) menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data Buku Reguler atau Tugas Akhir/Skripsi. Jika memilih Skripsi, aplikasi akan meminta input NIM Penulis, lalu secara otomatis memberikan output berupa informasi detail dari NIM tersebut seperti tahun angkatan masuk dan program studi pembuat skripsi menggunakan metode ekstraksi string.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `Skripsi`, dan `PerpustakaanBeraksi` adalah contoh dari class.

```java
public class Buku {
    ...
}

public class Skripsi extends Buku {
    ...
}

public class PerpustakaanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, koleksiPerpus[jumlahKoleksi] = new Buku(kode, judul); atau new Skripsi(kode, judul, nim); adalah contoh pembuatan object.

```bash
koleksiPerpus[jumlahKoleksi] = new Buku(kode, judul);
// atau
koleksiPerpus[jumlahKoleksi] = new Skripsi(kode, judul, nim);
```

3. **Atribut** Atribut adalah variabel yang ada dalam class. Pada kode ini, kodeBuku, judul, dan nimPenulis adalah contoh atribut.

```bash
private String kodeBuku;
private String judul;
private String nimPenulis;
```

4. **Constructor** Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Buku dan Skripsi.

```bash
public Buku(String kodeBuku, String judul) {
    this.kodeBuku = kodeBuku;
    this.judul = judul;
}

public Skripsi(String kodeBuku, String judul, String nimPenulis) {
    super(kodeBuku, judul);
    this.nimPenulis = nimPenulis;
}
```

5. **Mutator** Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setKodeBuku dan setJudul adalah contoh method mutator.

```bash
public void setKodeBuku(String kodeBuku) {
    this.kodeBuku = kodeBuku;
}

public void setJudul(String judul) {
    this.judul = judul;
```

6. **Accessor** Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getKodeBuku, getJudul, dan getNimPenulis adalah contoh method accessor.

```bash
public String getKodeBuku() {
    return this.kodeBuku;
}

public String getJudul() {
    return this.judul;
}
```

7. **Encapsulation** Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private and hanya bisa diakses melalui method. Pada kode ini, atribut kodeBuku dan judul dienkapsulasi menggunakan modifier private.

```bash
private String kodeBuku;
private String judul;
```

8. **Inheritance** Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, Skripsi mewarisi Buku dengan sintaks extends.

```bash
public class Skripsi extends Buku {
    ...
}
```

9. **Polymorphism** Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini menggunakan teknik Override, di mana method tampilkanInfo() di class Skripsi merupakan override dari method tampilkanInfo() yang ada di class Buku.

```bash
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("NIM Penulis  : " + this.nimPenulis);
    ...
}
```

10. **Seleksi** Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi switch-case untuk menu utama dan seleksi if-else dalam pemisahan jenis buku serta pembedahan NIM penulis untuk mencari prodi dan angkatan.
```bash
switch (pilihan) {
    case 1:
        ...
}

if (kodeProdi.equals("10")) {
    prodi = "Teknik Informatika";
} else {
    prodi = "Program Studi Lain";
}
```

11. **Perulangan** Perulangan adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop while untuk menjaga aplikasi tetap berjalan interaktif dan loop for untuk membongkar serta menampilkan data dari Array.
```bash
while (pilihan != 3) {
    ...
}

for (int i = 0; i < jumlahKoleksi; i++) {
    koleksiPerpus[i].tampilkanInfo();
}
```

12. **Input Output Sederhana** Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input ketikan keyboard dan method System.out.println untuk menampilkan output data terminal.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Judul     : ");
String judul = input.nextLine();

System.out.println("\n--- DAFTAR KOLEKSI PERPUSTAKAAN (ARRAY & POLYMORPHISM) ---");
```

13. **Array** Array adalah struktur data yang digunakan untuk menyimpan beberapa nilai atau objek dalam satu variabel berkelompok. Pada kode ini, Buku[] koleksiPerpus = new Buku[100]; adalah contoh penggunaan array objek.

```bash
Buku[] koleksiPerpus = new Buku[100];
```

14. **Error Handling** Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan block try-catch dengan exception InputMismatchException untuk menangani kesalahan input menu berupa huruf.

```bash
try {
    pilihan = input.nextInt();
} catch (InputMismatchException e) {
    System.out.println("\n>> [ERROR] Input harus berupa angka! Silakan coba lagi. <<");
    input.nextLine();
    pilihan = 0;
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

Nama: Muhammad Reynaldy Abhista Putra
NPM: 2410010010
