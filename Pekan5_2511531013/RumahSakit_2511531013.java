package pekan5_2511531013;

import java.util.Scanner;

public class RumahSakit_2511531013 {

    // head linked list
    private Pasien_2511531013 head_1013;

    // menyimpan nomor antrian terakhir
    private int nomorTerakhir_1013;

    // menghitung jumlah pasien
    private int jumlahPasien_1013;

    // konstruktor
    public RumahSakit_2511531013() {
        head_1013 = null;
        nomorTerakhir_1013 = 0;
        jumlahPasien_1013 = 0;
    }

    // insert di tail / tambah pasien di akhir linked list
    public void daftarkanPasien_1013(String namaPasien_1013, String keluhan_1013) {
        // nomor antrian bertambah otomatis
        nomorTerakhir_1013++;
        // membuat node pasien baru
        Pasien_2511531013 pasienBaru_1013 = new Pasien_2511531013(namaPasien_1013, keluhan_1013, nomorTerakhir_1013);
        // jika linked list kosong
        if (head_1013 == null) {
            // pasien baru jadi head
            head_1013 = pasienBaru_1013;
        } else {
            // traversal sampai node terakhir
            Pasien_2511531013 curr_1013 = head_1013;
            while (curr_1013.getNext_1013() != null) {
                curr_1013 = curr_1013.getNext_1013();
            }
            // sambungkan node terakhir ke node baru
            curr_1013.setNext_1013(pasienBaru_1013);
        }

        jumlahPasien_1013++;
        System.out.println("Pasien berhasil didaftarkan!");
        System.out.println("Nomor Antrian : " + nomorTerakhir_1013);
    }

    // delete head / panggil pasien terdepan
    public void panggilPasien_1013() {
        // cek apakah antrian kosong
        if (head_1013 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        // menyimpan pasien yang dipanggil
        Pasien_2511531013 pasienDipanggil_1013 = head_1013;
        // head digeser ke node berikutnya
        head_1013 = head_1013.getNext_1013();
        jumlahPasien_1013--;
        System.out.println("Pasien yang dipanggil:");
        System.out.println(pasienDipanggil_1013);
    }

    // menampilkan semua antrian pasien
    public void tampilkanAntrian_1013() {
        // cek apakah list kosong
        if (head_1013 == null) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        Pasien_2511531013 curr_1013 = head_1013;

        int posisi_1013 = 1;

        System.out.println("Daftar Antrian Pasien:");

        // traversal linked list
        while (curr_1013 != null) {

            System.out.println("Posisi " + posisi_1013 + " -> " + curr_1013);
            curr_1013 = curr_1013.getNext_1013();
            posisi_1013++;
        }
    }
    // mencari pasien berdasarkan nama
    public void cariPasien_1013(String namaCari_1013) {

        // cek apakah list kosong
        if (head_1013 == null) {

            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511531013 curr_1013 = head_1013;
        int posisi_1013 = 1;
        boolean ditemukan_1013 = false;
        // traversal untuk pencarian data
        while (curr_1013 != null) {

            // pencarian tanpa membedakan huruf besar kecil
            if (curr_1013.getNamaPasien_1013().equalsIgnoreCase(namaCari_1013)) {
                System.out.println("Pasien ditemukan pada posisi " + posisi_1013);
                System.out.println(curr_1013);
                ditemukan_1013 = true;
                break;
            }
            curr_1013 = curr_1013.getNext_1013();
            posisi_1013++;
        }
        // jika data tidak ditemukan
        if (!ditemukan_1013) {
            System.out.println("Pasien dengan nama " + namaCari_1013 + " tidak ditemukan.");
        }
    }

    // cek status antrian
    public void cekStatusAntrian_1013() {
        // jika antrian kosong
        if (head_1013 == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Jumlah pasien : " + jumlahPasien_1013);
            System.out.println("Pasien terdepan : " + head_1013);
        }
    }

    // method untuk menampilkan menu
    public static void tampilkanMenu_1013() {
        System.out.println("\n=== Antrian Rumah Sakit 2511531013 ===");
        System.out.println("1. Daftarkan Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Cari Pasien");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
        System.out.print("Pilihan : ");
    }
    public static void main(String[] args) {
        Scanner input_1013 = new Scanner(System.in);
        RumahSakit_2511531013 rs_1013 = new RumahSakit_2511531013();
        int pilihan_1013;
        do {
            tampilkanMenu_1013();
            pilihan_1013 = input_1013.nextInt();
            input_1013.nextLine();
            switch (pilihan_1013) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String namaPasien_1013 = input_1013.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_1013 = input_1013.nextLine();
                    rs_1013.daftarkanPasien_1013(namaPasien_1013, keluhan_1013);
                    break;
                case 2:
                    rs_1013.panggilPasien_1013();
                    break;
                case 3:
                    rs_1013.tampilkanAntrian_1013();
                    break;
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari : ");
                    String namaCari_1013 = input_1013.nextLine();
                    rs_1013.cariPasien_1013(namaCari_1013);
                    break;
                case 5:
                    rs_1013.cekStatusAntrian_1013();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan_1013 != 6);
        input_1013.close();
    }
}