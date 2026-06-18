package PBO;

// INHERITANCE (Menggunakan kata kunci extends)
public class Skripsi extends Buku {
    private String nimPenulis;

    // Constructor Anak
    public Skripsi(String kodeBuku, String judul, String nimPenulis) {
        super(kodeBuku, judul); // Memanggil constructor induk
        this.nimPenulis = nimPenulis;
    }

    // Accessor khusus anak
    public String getNimPenulis() {
        return this.nimPenulis;
    }

    // POLYMORPHISM (Melakukan Override method milik induk)
    @Override
    public void tampilkanInfo() {
        System.out.println("Kode Koleksi : " + getKodeBuku());
        System.out.println("Judul        : " + getJudul());
        System.out.println("Jenis        : Tugas Akhir / Skripsi");
        System.out.println("NIM Penulis  : " + this.nimPenulis);
        
        // MATERI: SELEKSI 
        if (this.nimPenulis.length() >= 4) {
            // Mengambil 2 angka awal sebagai Angkatan (Misal 24 -> 2024)
            String angkatan = "20" + this.nimPenulis.substring(0, 2);
            // Mengambil 2 angka setelahnya sebagai kode prodi (Misal 10 -> TI)
            String kodeProdi = this.nimPenulis.substring(2, 4);
            String prodi;
            
            // Seleksi If-Else untuk menentukan nama Program Studi
            if (kodeProdi.equals("10")) {
                prodi = "Teknik Informatika";
            } else {
                prodi = "Program Studi Lain";
            }
            
            System.out.println("Angkatan     : " + angkatan + " ");
            System.out.println("Program Studi: " + prodi + " ");
        } else {
            System.out.println("Angkatan     : Tidak Diketahui (Format NIM Salah)");
            System.out.println("Program Studi: Tidak Diketahui (Format NIM Salah)");
        }
    }
}