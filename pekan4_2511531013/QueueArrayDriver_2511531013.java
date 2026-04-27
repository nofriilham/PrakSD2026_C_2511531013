package pekan4_2511531013;
import java.util.*;
public class QueueArrayDriver_2511531013 {
	public static void main(String[]args) {
	QueueArray_2511531013 queue_1013= new QueueArray_2511531013(1000);
	queue_1013.enqueue_2511531013(10);
	queue_1013.enqueue_2511531013(20);
	queue_1013.enqueue_2511531013(30);
	queue_1013.enqueue_2511531013(40);
	System.out.println("item di depan"+queue_1013.front_2511531013());
	System.out.println("Item paling belakang" + queue_1013.rear());
	System.out.println("tampilan queue");
	queue_1013.display();
	System.out.println();
	System.out.println(queue_1013.dequeue_2511531013()+ "dihapus dari queue");
	System.out.println("item di depan: "+ queue_1013.front_2511531013());
	System.out.println("Item paling belakang" + queue_1013.rear());
	System.out.println("tampilan queue setelah satu data dihapus");
	queue_1013.display();
}
}
