package Pekan2_2511531013;
import java.util.Scanner;
public class DaftarKataDriver_2511531013 {

	public static void main(String[] args) {
		DaftarKata_2511531013 al= new DaftarKata_2511531013();
		//menambah elemen(akhir)
		al.tambah_2511531013("Kami");
		al.tambah_2511531013("Informatika");
		
		//Menyisipkan elemen pada indeks 1
		al.tambahPada_2511531013(1,"Mahasiswa");
		
		//Cetak isi awal
		System.out.println("Awal       :"+al);
		
		//Mengubah Elemen(index 1)
		al.ubahElemen_2511531013(1,"Departemen");
		System.out.println("Setelah Ubah: "+ al);
		
		//Mengapus elemen (hapus index 0)
		String terhapus= al.hapusElemen_2511531013(0);
		System.out.println("Terhapus  :"+ terhapus);
		System.out.println("Setelah Hapus:  "+al);
		
		//Iterasi pada ArrayList (Cetak setiap elemen)
		System.out.println("Iterasi");
		al.iterasiCetak_2511531013();
		System.out.println();
		
		
		// TODO Auto-generated method stub

	}

}
