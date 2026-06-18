package PBO;

// MATERI: IO SEDERHANA (Mengimport library Scanner)
import java.util.Scanner;
import java.util.InputMismatchException;

public class PerpustakaanBeraksi {
    public static void main(String[] args) {
        //  MATERI: ARRAY (Menampung objek Buku & Skripsi secara berkelompok)
        Buku[] koleksiPerpus = new Buku[100];
        int jumlahKoleksi = 0;
        
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        // MATERI: PERULANGAN (Menggunakan while agar program terus berjalan)
        while (pilihan != 3) {
            //MATERI: ERROR HANDLING (Mengamankan input menggunakan try-catch)
            try {
                System.out.println("\n=====================================================");
                System.out.println("    SELAMAT DATANG DI PERPUSTAKAAN UNISKA ");
                System.out.println("=====================================================");
                System.out.println("1. Tambah Koleksi Buku / Skripsi");
                System.out.println("2. Tampilkan Semua Koleksi Perpustakaan");
                System.out.println("3. Keluar dari Program");
                System.out.print("Pilih Menu (1-3): ");
                
                pilihan = input.nextInt();
                input.nextLine(); // Membersihkan sisa buffer enter

                // MATERI: SELEKSI (Menggunakan switch-case untuk mengarahkan menu)
                switch (pilihan) {
                    case 1:
                        System.out.println("\nPilih Jenis Koleksi:");
                        System.out.println("[1] Buku Reguler");
                        System.out.println("[2] Tugas Akhir / Skripsi");
                        System.out.print("Pilihan Anda: ");
                        int jenis = input.nextInt();
                        input.nextLine();

                        System.out.print("Masukkan Kode Buku : ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan Judul     : ");
                        String judul = input.nextLine();

                        //  MATERI: SELEKSI (Mengarahkan pembuatan tipe objek)
                        if (jenis == 1) {
                            //  MATERI: OBJECT (Instansiasi objek induk)
                            koleksiPerpus[jumlahKoleksi] = new Buku(kode, judul);
                            jumlahKoleksi++;
                            System.out.println("\n>> DATA BUKU BERHASIL DISIMPAN! <<");
                        } else if (jenis == 2) {
                            System.out.print("Masukkan NIM Penulis: ");
                            String nim = input.nextLine();
                            //  MATERI: OBJECT (Instansiasi objek anak)
                            koleksiPerpus[jumlahKoleksi] = new Skripsi(kode, judul, nim);
                            jumlahKoleksi++;
                            System.out.println("\n>> DATA SKRIPSI BERHASIL DISIMPAN! <<");
                        } else {
                            System.out.println("\n>> [ERROR] Pilihan jenis tidak valid! <<");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- DAFTAR KOLEKSI PERPUSTAKAAN ) ---");
                        if (jumlahKoleksi == 0) {
                            System.out.println("Koleksi perpustakaan masih kosong.");
                        } else {
                            //  MATERI: PERULANGAN (Menggunakan for untuk membongkar isi Array)
                            for (int i = 0; i < jumlahKoleksi; i++) {
                                System.out.println("-----------------------------------------------------");
                                // Eksekusi Polymorphism: Memanggil nama method sama, hasil beda
                                koleksiPerpus[i].tampilkanInfo(); 
                                System.out.println("-----------------------------------------------------");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("\nTerima Kasih! Program Selesai!");
                        break;

                    default:
                        System.out.println("\n>> [ERROR] Menu tidak tersedia! Silakan pilih 1-3. <<");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n>> [ERROR] Input harus berupa angka! Silakan coba lagi. <<");
                input.nextLine(); // Membersihkan input salah agar tidak terjadi loop infinite
                pilihan = 0; // Mereset pilihan agar program tidak langsung close
            }
        }
        input.close();
    }
}