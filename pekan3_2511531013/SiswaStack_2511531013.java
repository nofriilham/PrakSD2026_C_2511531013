package pekan3_2511531013;
import java.util.ArrayList;
class Siswa_2511531013 {
	String nama_1013;
	int nim_1013;
	
	public Siswa_2511531013 (String nama_1013, int nim_1013) {
		this.nama_1013= nama_1013;
		this.nim_1013= nim_1013;
		
	}
	
	@Override
	public String toString () {
		return "NIM: " + nim_1013 + ", Nama : " +nama_1013;
	}
}
public class SiswaStack_2511531013 {
	private ArrayList<Siswa_2511531013> stack_1013;
	
	public SiswaStack_2511531013() {
		stack_1013 = new ArrayList<>();
	}
	public void push (Siswa_2511531013 mhs) {
		stack_1013.add(mhs);
	}

public Siswa_2511531013 pop() {
	if (!isEmpty()) {
		return stack_1013.remove(stack_1013.size() -1);
	 }
	 return null;
    }
 public Siswa_2511531013 peek() {
	 if (!isEmpty()) {
		 return stack_1013.get(stack_1013.size() -1 );
	 }
	 return null;
 }
 
 public boolean isEmpty () {
	 return stack_1013.isEmpty();
	 }
  public void tampilkanSiswa_1013() {
	  for (int i= stack_1013.size() -1; i>=0; i--) {
		  System.out.println(stack_1013.get(i));
	  }
  }
  public static void main (String [] args) {
	  SiswaStack_2511531013 studentstack = new SiswaStack_2511531013();
	  
	  Siswa_2511531013 mhs1 = new Siswa_2511531013 ("Ali ", 1);
	  Siswa_2511531013 mhs2 = new Siswa_2511531013 ("Boby ", 2);
	  Siswa_2511531013 mhs3 = new Siswa_2511531013 ("Charles ", 3);
	  
	  studentstack.push(mhs1);
	  studentstack.push(mhs2);
	  studentstack.push(mhs3);
	  
	  System.out.println("siswa di dalam stack : ");
	  studentstack.tampilkanSiswa_1013();
	  
	  System.out.println("siswa teratas " + studentstack.peek());
	  System.out.println("mengeluarkan siswa teratas dari stack " + studentstack.pop());
	  System.out.println("daftar siswa setelah di pop : ");
	  studentstack.tampilkanSiswa_1013();
  }
 
}