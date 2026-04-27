package pekan4_2511531013;

public class QueueArray_2511531013 {
	int front_1013,rear_1013,size_1013;
	int capacity_1013;
	int array_1013[];
	
	public QueueArray_2511531013(int capacity) {
		this.capacity_1013=capacity;
		front_1013=this.size_1013=0;
		rear_1013=capacity-1;
		array_1013= new int[this.capacity_1013];
		
	}
	
	boolean isFull_2511531013(QueueArray_2511531013 queue) {
		return (queue.size_1013==queue.capacity_1013);
	}
	boolean isEmpty_2511531013(QueueArray_2511531013 queue) {
		return (queue.size_1013==0);
	}
	
	void enqueue_2511531013(int item) {
		if(isFull_2511531013(this))
			return;
		this.rear_1013=(this.rear_1013+1) % this.capacity_1013;
		this.array_1013[this.rear_1013]=item;
		this.size_1013=this.size_1013 +1;
		System.out.println(item+ "enqueued to queue ");
	}
		int dequeue_2511531013() {
			if(isEmpty_2511531013(this))
				return Integer.MIN_VALUE;
			int item=this.array_1013[this.front_1013];
			int front=(this.front_1013+1)% this.capacity_1013;
			this.size_1013=this.size_1013-1;
			return item;
		}
		int front_2511531013() {
			if(isEmpty_2511531013(this))
				return Integer.MIN_VALUE;
			return this.array_1013[this.front_1013];
		}
		int rear() {
			if (isEmpty_2511531013(this))
				return Integer.MIN_VALUE;
			return this.array_1013[this.rear_1013];
		}
			//mencetak elemen antrian
		void display() {
			int i;
			if (front_1013==rear_1013) {
				System.out.println("\nAntrian Kosong");
				return;
			}
			//Kunjungi dari belakang dan cetak
			for(i=front_1013;i<rear_1013;i++) {
				System.out.printf("%d <--",array_1013[i]);
			}
			return;
		}

			
				
			
			
			
		
			
	
}


