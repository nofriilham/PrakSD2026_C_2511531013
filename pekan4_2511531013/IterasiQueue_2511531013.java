package pekan4_2511531013;
import java.util.*;
public class IterasiQueue_2511531013 {
	public static void main(String[] args) 
	{
		Queue<String> q_1013=new LinkedList<>();
		
		q_1013.add("Praktikum");
		q_1013.add("Struktur");
		q_1013.add("Data");
		q_1013.add("Dan");
		q_1013.add("Alghoritma");
		Iterator<String> iterator=q_1013.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
	}
}
