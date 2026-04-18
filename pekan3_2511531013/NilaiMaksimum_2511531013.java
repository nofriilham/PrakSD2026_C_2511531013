package pekan3_2511531013;
import java.util.Stack;
public class NilaiMaksimum_2511531013 {
	public static int max (Stack <Integer>s_1013) {	
	Stack <Integer> backup_1013 = new Stack <Integer>();
	int maxValue_1013 = s_1013.pop();
	backup_1013.push (maxValue_1013);
	while (!s_1013.isEmpty()) {
		int next_1013=s_1013.pop();
		backup_1013.push(next_1013);
		maxValue_1013 = Math.max(maxValue_1013, next_1013);
	}
	while (!backup_1013.isEmpty() ) {
		s_1013.push(backup_1013.pop());
	}
	return maxValue_1013;
  }
	public static void main(String[] args) {
		Stack <Integer> s_1013 = new Stack<Integer> ();
		s_1013.push (70);
		s_1013.push (12);
		s_1013.push (20);
		System.out.println("isi stack " + s_1013);
		System.out.println("Stack Teratas " + s_1013.peek());
		System.out.println("nilai maksimum " + max(s_1013));	
	}

}