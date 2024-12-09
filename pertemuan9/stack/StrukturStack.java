package pertemuan9.stack;

public class StrukturStack {
	private int[] array;
	private int capacity;
	private int TOP;
	
	public final int MIN = -1;
	
	public StrukturStack(int capacity) {
		
		array = new int[capacity];
		this.capacity = capacity;
		TOP = MIN;
	}
	public boolean isEmpty() {
		return (TOP == MIN);
	}
	public boolean isFull() {
		return (TOP == capacity - 1);
	}
	public int size() {
	    return TOP + 1;
	}

	public int top() {
	    if (isEmpty()) {
	        
	        return -1; 
	    } else {
	        return array[TOP];
	    }
	}
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack penuh");
		}else {
			TOP++;
			array[TOP] = data;
		}
	}
	public int pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack kosong");
		}
		else {
			temp = array[TOP];
			TOP = TOP-1;
		}
		return temp;
	}
	public void displayElement() {
	    if (isEmpty()) {
	        System.out.println("Elemen from TOP :");
	        return;
	    }
	    System.out.print("Elemen from TOP: ");
	    for (int i = TOP; i >= 0; i--) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.println();
	}
}
