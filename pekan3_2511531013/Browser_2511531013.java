package Pekan3_2511531013;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531013 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Website_2511531013> history_1013 = new Stack<>();

        int pilihan_1013;

        do {
            System.out.println("\n=== Browser History NIM: 2511531013 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1013 = input.nextInt();
            input.nextLine();

            switch (pilihan_1013) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_1013 = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url_1013 = input.nextLine();

                    Website_2511531013 web = new Website_2511531013(judul_1013, url_1013);
                    history_1013.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_1013.isEmpty()) {
                        Website_2511531013 hapus = history_1013.pop();
                        System.out.println("Kembali dari: " + hapus.getJudul_1013());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history_1013.isEmpty()) {
                        Website_2511531013 atas = history_1013.peek();
                        System.out.println("Halaman Aktif:");
                        System.out.println("Judul: " + atas.getJudul_1013());
                        System.out.println("URL: " + atas.getUrl_1013());
                    } else {
                        System.out.println("Tidak ada halaman aktif!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari website");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_1013 != 4);

        input.close();
    }
}