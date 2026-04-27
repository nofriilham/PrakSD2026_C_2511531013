package pekan4_2511531013;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseData_2511531013 {

	public static void main(String[] args) {
		Queue<Integer>q_1013=new LinkedList<Integer>();
		q_1013.add(1);
		q_1013.add(2);
		q_1013.add(3); // [1,2,3]
		System.out.println("sebelum reverse"+q_1013);
		Stack<Integer>s=new Stack<Integer>();
		while(!q_1013.isEmpty()) {//Q->S
			s.push(q_1013.remove());
		}
		while(!s.isEmpty()) {//S->Q
			q_1013.add(s.pop());
		}
		System.out.println("Sesudah Reverse="+q_1013);//[3,2,1]
	}

}
