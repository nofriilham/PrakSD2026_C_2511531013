package Pekan2_2511531013;
import java.util.*;
import java.util.Scanner;
public class DaftarKata_2511531013 {
	private final ArrayList<String> data;
	//Konstruktor: inisialiasi list kosong
	public DaftarKata_2511531013() {
		this.data= new ArrayList<>	();
		
		}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511531013(String elemen) {
		data.add(elemen);
		
	}
	/* Menambahkan elemen pada indeks tertentu (menyisipkan).**/
	public void tambahPada_2511531013(int index,String elemen) {
		data.add(index,elemen);
		
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
	 * Bertindah sebagai "Setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511531013(int index,String nilaiBaru) {
		data.set(index,  nilaiBaru);
	
	}
	/**
	 * Menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511531013(int index) {
		return data.remove(index);
		
	}
	/**
	 * Melakukan iteasi dan mencetak setiap elemen dalam format: [index] nilai
	 * (Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi).
	 * 
	 */
	public void iterasiCetak_2511531013() {
		for(int i=0;i<data.size();i++) {
			System.out.print(data.get(i)+" ");
			
		}
	}
	/** Mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
	}
		//Representasi string dagar mudah dicetak
		@Override 
		public String toString() {
			return data.toString();
		}
	}

