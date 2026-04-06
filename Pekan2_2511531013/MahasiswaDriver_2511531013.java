package Pekan2_2511531013;

import java.util.*;
import java.util.Scanner;

public class MahasiswaDriver_2511531013 {
	//1. Method untuk menampilkan menu
	public static void tampilkanMenu() {
		System.out.println("\nMenu:");
		System.out.println("1.Tambah Mahasiswa");
		System.out.println("2.Tampilkan Semua Mahasiswa");
		System.out.println("3.Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiwa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	//2. Method untuk tambah mahasiswa
	public static void tambahMahasiswa(ArrayList<Mahasiswa_2511531013> list,Scanner sc){
		System.out.println("Masukkan NIM: ");
		String nim=sc.nextLine();
		System.out.println("Masukkan Nama: ");
		String nama=sc.nextLine();
		System.out.println("Masukkan Prodi: ");
		String prodi=sc.nextLine();
		list.add(new Mahasiswa_2511531013(nim,nama,prodi));
		System.out.println("Mahasiswa berhasil ditambahkan.");
	
	}
	//3. Method untuk tampilkan semua data
	public static void tampilkanSemuaMahasiswa(ArrayList<Mahasiswa_2511531013> list){
		if (list.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong.");
		}else {
			System.out.println("Data Mahsiswa");
			for (Mahasiswa_2511531013 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	//4. Method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa(ArrayList<Mahasiswa_2511531013> list,Scanner sc){
		System.out.println("Masukkan NIM yang akan dihapus");
		String nimHapus=sc.nextLine();
		boolean removed =list.removeIf(mhs->mhs.nim.equals(nimHapus));
		
		if (removed) {
			System.out.println("Data dengan NIM"+ nimHapus +"berhasil dihapus. ");
		} else {
			System.out.println("NIM tidak ditemukan");
		}
	}
	 //5.Method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa(ArrayList<Mahasiswa_2511531013>list,Scanner sc) {
	System.out.println("Masukkan NIM yang dicari: ");
	String nimCari=sc.nextLine();
	boolean ditemukan =false;
	
	for(Mahasiswa_2511531013 mhs : list) {
		if (mhs.nim.equals(nimCari)) {
			System.out.println("Hasil Pencarian: "+ mhs);
			ditemukan=true;
			break;
		}
	}
	
	if(!ditemukan) {
		System.out.println("NIM tidak ada.");
	}
}

	public static void main(String[] args) {
		ArrayList<Mahasiswa_2511531013> mahasiswaList = new ArrayList<>();
		Scanner scanner =new Scanner(System.in);
		int choice;
		
	do {
		tampilkanMenu();
		System.out.println("Pilih Menu");
		choice=scanner.nextInt();
		scanner.nextLine();//Consume newLine
		switch(choice) {
		case 1:
			tambahMahasiswa(mahasiswaList, scanner);
			break;
		case 2:
			tampilkanSemuaMahasiswa(mahasiswaList);
			break;
		case 3:
			hapusMahasiswa(mahasiswaList, scanner);
			break;
		case 4:
			cariMahasiswa(mahasiswaList, scanner);
			break;
		case 5:
		System.out.println("Keluar dari program.");
		break;
		default:
			System.out.println("Pilihan Tidak Valid.");
		
		}
	}while (choice !=5);
	scanner.close();
	}
	

	}



