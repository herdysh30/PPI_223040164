package pertemuan4.latihan;

public class StrukturList {
	private Node HEAD;
	private boolean isEmpty() {
		return (HEAD == null);
	}
	public void addTail (int data) {
		Node posNode=null, curNode=null;
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else
		{
			curNode = HEAD;
			while(curNode != null)
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	public void addMid (int data, int position) {
		Node posNode = null,curNode = null;
		Node newNode = new Node(data);
		int i;
		if (HEAD == null ) {
			HEAD = newNode;
		}
		else {
			curNode = HEAD;
		}
		if (position == 1){
			newNode.setNext(curNode);
			HEAD = newNode;
		}else {
			i = 1;
			while (curNode != null && i < position) {
				posNode = curNode;
				curNode = curNode.getNext();
				i++;		
			}
			posNode.setNext(newNode);
			newNode.setNext(curNode);
		}
	}
	public void displayElement() {
		Node curNode = HEAD;
		if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }
		while (curNode !=null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
		
	}
}
