package Pekan2_2511531013;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511531013 {

    // 1. Method untuk menampilkan Menu
    public static void tampilkanMenu_2511531013() {
        System.out.println("\n=== Playlist Musik NIM: 2511531013 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Cek Kapasitas");
        System.out.println("5. Keluar");
    }

    // 2. Method untuk menambah Lagu
    public static void tambahLagu_2511531013(ArrayList<Musik_2511531013> list, Scanner sc) {
        System.out.print("Masukkan Judul: ");
        String Judul_1013 = sc.nextLine();

        System.out.print("Masukkan Penyanyi: ");
        String Penyanyi_1013 = sc.nextLine();

        System.out.print("Masukkan Durasi (detik): ");
        int Durasi_1013 = sc.nextInt();
        sc.nextLine();

        list.add(new Musik_2511531013(Judul_1013, Penyanyi_1013, Durasi_1013));
        System.out.println("Lagu berhasil ditambahkan!");
    }
    // 3. Method untuk melihat Playlist
    public static void lihatPlaylist_2511531013(ArrayList<Musik_2511531013> list) {
        if (list.isEmpty()) {
            System.out.println("Playlist kamu masih kosong.");
        } else {
            System.out.println("Daftar Lagu:");
            int i = 1;
            for (Musik_2511531013 lagu : list) {
                System.out.println(i + ". " + lagu);
                i++;
            }
        }
    }
    // 4. Method untuk menghapus Lagu (berdasarkan index lagu)
    public static void hapusLagu_2511531013(ArrayList<Musik_2511531013> list, Scanner sc) {
        System.out.print("Masukkan nomor lagu yang akan dihapus: ");
        int index_1013 = sc.nextInt();
        sc.nextLine();

        if (index_1013 > 0 && index_1013 <= list.size()) {
            list.remove(index_1013 - 1);
            System.out.println("Lagu berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // 5. Method untuk mengetes pilihan
    public static void cekPilihan_2511531013(ArrayList<Musik_2511531013> list) {
        System.out.println("Jumlah lagu dalam playlist: " + list.size());
    }

    public static void main(String[] args) {
        ArrayList<Musik_2511531013> playlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu_2511531013();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahLagu_2511531013(playlist, sc);
                    break;
                case 2:
                    lihatPlaylist_2511531013(playlist);
                    break;
                case 3:
                    hapusLagu_2511531013(playlist, sc);
                    break;
                case 4:
                	cekPilihan_2511531013(playlist);
                    break;
                case 5: 
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}