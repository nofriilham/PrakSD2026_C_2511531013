package pekan3_2511531013;

public class stackArray_2511531013 {
	static final int MAX_1013= 1000;
	int top_1013;
	int a[] = new int [MAX_1013];
	boolean isEmpty_1013()  
	{
		return (top_1013 < 0) ;
	}
	stackArray_2511531013() 
	{
		top_1013=-1;
	}
	boolean push_1013 (int x)
	{
		if (top_1013>= (MAX_1013 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_1013] = x;
			System.out.println( x  + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_1013() 
	{
		if (top_1013 < 0 ) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top_1013--];
			return x;
		}
	}
	int peek_1013() 
	{
		if (top_1013<0) 
		{
			System.out.println("stack underflow");
			return 0;
		}
		else 
		{
			int x = a [top_1013];
			return x;
		}
	}
	void print_1013 () {
		for (int i=top_1013; i>-1;i--) {
			System.out.print(" " +a[i]);
		}
	}

}
