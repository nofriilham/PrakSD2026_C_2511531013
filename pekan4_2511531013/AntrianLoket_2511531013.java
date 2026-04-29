package pekan4_2511531013;
import java.util.*;

public class AntrianLoket_2511531013 {
    //Deklarasi Variabel
    String queue_1013[]; // array penyimpan data
    int front_1013;      // indeks depan
    int rear_1013;       // indeks belakang
    int max_1013;        // kapasitas maksimum

    // Constructor
    public AntrianLoket_2511531013(int max_1013) {
        this.max_1013 = max_1013;
        queue_1013 = new String[max_1013];
        front_1013 = -1;
        rear_1013 = -1;
    }

    // Cek kosong
    boolean isEmpty_1013() {
        return (front_1013 == -1);
    }

    // Cek penuh
    boolean isFull_1013() {
        return (rear_1013 == max_1013 - 1);
    }

    // Enqueue (menambah antrian)
    void enqueue_1013(String data_1013) {
        if (isFull_1013()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_1013()) {
                front_1013 = 0;
            }
            rear_1013++;
            queue_1013[rear_1013] = data_1013;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue_1013 (hapus data)
    void dequeue_1013() {
        if (isEmpty_1013()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_1013[front_1013] + " telah dilayani");
            front_1013++;

            // reset jika kosong lagi
            if (front_1013 > rear_1013) {
                front_1013 = rear_1013 = -1;
            }
        }
    }

    // Display (tampilkan antrian)
    void display_1013() {
        if (isEmpty_1013()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no_1013 = 1;
            for (int i_1013 = front_1013; i_1013 <= rear_1013; i_1013++) {
                System.out.println(no_1013 + ". " + queue_1013[i_1013]);
                no_1013++;
            }
        }
    }

    // Reverse antrian
    void reverse_1013() {
        if (isEmpty_1013()) {
            System.out.println("Antrian kosong!");
        } else {
            int i_1013 = front_1013, j_1013 = rear_1013;
            while (i_1013 < j_1013) {
                String temp_1013 = queue_1013[i_1013];
                queue_1013[i_1013] = queue_1013[j_1013];
                queue_1013[j_1013] = temp_1013;
                i_1013++;
                j_1013--;
            }
            System.out.println("Antrian berhasil dibalik");
        }
    }

    // Main Program (Menu)
    public static void main(String[] args) {
        Scanner input_1013 = new Scanner(System.in);
        AntrianLoket_2511531013 q_1013 = new AntrianLoket_2511531013(10);

        int pilihan_1013;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_1013 = input_1013.nextInt();
            input_1013.nextLine(); // buang enter

            switch (pilihan_1013) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_1013 = input_1013.nextLine();
                    q_1013.enqueue_1013(nama_1013);
                    break;
                case 2:
                    q_1013.dequeue_1013();
                    break;
                case 3:
                    q_1013.display_1013();
                    break;
                case 4:
                    q_1013.reverse_1013();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_1013 != 5);
        input_1013.close();
    }
}