package Pekan8_2511531013;
import java.util.Scanner;

public class Sorting_2511531013 {

    Scanner input_1013 = new Scanner(System.in);

    // Array untuk menyimpan maksimal 20 data lagu
    static dataLagu_2511531013[] dataLagu_1013 =
            new dataLagu_2511531013[20];

    // Method untuk menginput data lagu
    public static dataLagu_2511531013 inputData_1013(
            Scanner input_1013) {

        System.out.print("Judul Lagu    : ");
        String judul_1013 = input_1013.nextLine();

        System.out.print("Penyanyi Lagu : ");
        String penyanyi_1013 = input_1013.nextLine();

        System.out.print("Durasi Lagu   : ");
        int durasi_1013 = input_1013.nextInt();

        input_1013.nextLine();

        return new dataLagu_2511531013(
                judul_1013,
                penyanyi_1013,
                durasi_1013
        );
    }

    // Menukar posisi dua data lagu
    static void swap_1013(
            dataLagu_2511531013[] dataLagu_1013,
            int i_1013,
            int j_1013) {

        dataLagu_2511531013 temp_1013 =
                dataLagu_1013[i_1013];

        dataLagu_1013[i_1013] =
                dataLagu_1013[j_1013];

        dataLagu_1013[j_1013] =
                temp_1013;
    }

    // Mengatur pivot menggunakan metode Median of Three
    static void medianOfThree_1013(
            dataLagu_2511531013[] dataLagu_1013,
            int low_1013,
            int high_1013) {

        int mid_1013 =
                low_1013 + (high_1013 - low_1013) / 2;

        if (dataLagu_1013[low_1013].getDurasi_1013() >
                dataLagu_1013[mid_1013].getDurasi_1013()) {

            swap_1013(dataLagu_1013,
                    low_1013,
                    mid_1013);
        }

        if (dataLagu_1013[low_1013].getDurasi_1013() >
                dataLagu_1013[high_1013].getDurasi_1013()) {

            swap_1013(dataLagu_1013,
                    low_1013,
                    high_1013);
        }

        if (dataLagu_1013[mid_1013].getDurasi_1013() >
                dataLagu_1013[high_1013].getDurasi_1013()) {

            swap_1013(dataLagu_1013,
                    mid_1013,
                    high_1013);
        }

        swap_1013(dataLagu_1013,
                mid_1013,
                high_1013);
    }

    // Membagi data berdasarkan pivot
    static int partition_1013(
            dataLagu_2511531013[] dataLagu_1013,
            int low_1013,
            int high_1013) {

        medianOfThree_1013(
                dataLagu_1013,
                low_1013,
                high_1013);

        dataLagu_2511531013 pivot_1013 =
                dataLagu_1013[high_1013];

        int i_1013 = low_1013 - 1;

        for (int j_1013 = low_1013;
             j_1013 <= high_1013 - 1;
             j_1013++) {

            if (dataLagu_1013[j_1013]
                    .getDurasi_1013() <
                    pivot_1013.getDurasi_1013()) {

                i_1013++;

                swap_1013(
                        dataLagu_1013,
                        i_1013,
                        j_1013);
            }
        }

        swap_1013(
                dataLagu_1013,
                i_1013 + 1,
                high_1013);

        return i_1013 + 1;
    }

    // Proses pengurutan menggunakan Quick Sort
    static void quickSort_1013(
            dataLagu_2511531013[] dataLagu_1013,
            int low_1013,
            int high_1013) {

        if (low_1013 < high_1013) {

            int pi_1013 =
                    partition_1013(
                            dataLagu_1013,
                            low_1013,
                            high_1013);

            quickSort_1013(
                    dataLagu_1013,
                    low_1013,
                    pi_1013 - 1);

            quickSort_1013(
                    dataLagu_1013,
                    pi_1013 + 1,
                    high_1013);
        }
    }

    // Menampilkan data lagu
    public static void tampilData_1013(
            dataLagu_2511531013[] dataLagu_1013,
            int jumlah_1013) {

        for (int i_1013 = 0;
             i_1013 < jumlah_1013;
             i_1013++) {

            System.out.println(
                    (i_1013 + 1) + ". "
                    + dataLagu_1013[i_1013]);
        }
    }

    // Program utama
    public static void main(String[] args) {

        Scanner input_1013 =
                new Scanner(System.in);

        int jumlah_1013;

        System.out.println(
                "=== Sorting Playlist NIM: 2511531013 ===");

        do {

            System.out.print(
                    "Jumlah Lagu (Minimal 7): ");

            jumlah_1013 =
                    input_1013.nextInt();

            input_1013.nextLine();

            if (jumlah_1013 < 7) {

                System.out.println(
                        "Minimal harus 7 lagu!");
            }

        } while (jumlah_1013 < 7);

        for (int i_1013 = 0;
             i_1013 < jumlah_1013;
             i_1013++) {

            System.out.println(
                    "\nData Lagu Ke-" +
                    (i_1013 + 1));

            dataLagu_1013[i_1013] =
                    inputData_1013(
                            input_1013);
        }

        System.out.println(
                "\nData Sebelum Sorting:");

        tampilData_1013(
                dataLagu_1013,
                jumlah_1013);

        quickSort_1013(
                dataLagu_1013,
                0,
                jumlah_1013 - 1);

        System.out.println(
                "\nData Setelah Quick Sort (Durasi Asc):");

        tampilData_1013(
                dataLagu_1013,
                jumlah_1013);
    }
}