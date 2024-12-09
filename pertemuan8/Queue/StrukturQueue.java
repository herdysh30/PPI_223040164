package pertemuan8.Queue;

public class StrukturQueue {
	private Node FRONT;
	private Node REAR;
	public boolean isEmpty() {
		return (FRONT == null);
	}
	public void dispose(Node temp) {
		temp.setNext(null);
		temp = null;
	}
	public void displayElement() {
		Node curNode = FRONT;
		if (isEmpty()) {
			System.out.println("Queue kosong");
			return;
		}
		System.out.print("Elemen Queue :");
		while (curNode !=null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
		System.out.println();
		
	}
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		}
		else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}
	public int size() {
		int size=0;
		Node curNode = FRONT;
		while(curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}
	public int rear() {
		return REAR != null ? REAR.getData() : -1;
	}
	public void deQueue() {
		Node temp;
		if(FRONT != null) {
			if(FRONT == REAR) {
				FRONT = null;
				REAR = null;
			}else {
				temp = FRONT;
				FRONT = FRONT.getNext();
				dispose(temp);
			}
		}
	}
}
