package stack;

class stack{
	
	int a[] = new int[10];
	int tos;
	// Initialize top-of-stack
	
	stack() {
	tos = -1;
	}
	
	// Push an item onto the stack
	void push(int item) {
	if(tos==9)
	System.out.println("Stack is full.");
	else
	a[++tos] = item;
	}
	// Pop an item from the stack
	int pop() {
	if(tos < 0) {
	System.out.println("Stack underflow.");
	return 0;
	}
	else
	return a[tos--];
	}
}

public class StackImplementation {

	public static void main(String args[]) {
		stack x1 = new stack();
		stack x2 = new stack();
		// push some numbers onto the stack
		for(int i=0; i<10; i++) 
			x1.push(i);
		for(int i=10; i<20; i++) 
			x2.push(i);
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		
		for(int i=0; i<10; i++)
		System.out.println(x1.pop());
		
		System.out.println("Stack in mystack2:");
		
		for(int i=0; i<10; i++)
		System.out.println(x2.pop());
		}
}
