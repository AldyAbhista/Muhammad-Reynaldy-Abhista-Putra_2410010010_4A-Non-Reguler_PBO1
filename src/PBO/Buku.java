package PBO;

// MATERI: CLASS
public class Buku {
    // MATERI: ATRIBUT & MATERI: ENCAPSULATION (Menggunakan private)
    private String kodeBuku;
    private String judul;

    // MATERI: CONSTRUCTOR (Inisialisasi data awal)
    public Buku(String kodeBuku, String judul) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
    }

    // MATERI: MUTATOR (Setter untuk mengubah data)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    // MATERI: ACCESSOR (Getter untuk mengambil data)
    public String getKodeBuku() {
        return this.kodeBuku;
    }

    public String getJudul() {
        return this.judul;
    }

    // Method yang nantinya akan di-override di class anak
    public void tampilkanInfo() {
        System.out.println("Kode Koleksi : " + this.kodeBuku);
        System.out.println("Judul        : " + this.judul);
        System.out.println("Jenis        : Buku Reguler");
    }
}