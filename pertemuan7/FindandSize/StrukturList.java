package pertemuan7.FindandSize;

public class StrukturList {
	private Node HEAD;
	public boolean isEmpty() {
		return (HEAD == null);
	}
	public void dispose(Node temp) {
		temp.setNext(null);
		temp = null;
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
	public void removeHead() {
		if (isEmpty()) {
			System.out.println("List Kosong");
		}
		else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}
	public void removeTail() {
		Node preNode = null;
		Node lastNode;
		if(HEAD != null) {
			if(HEAD.getNext() == null) {
				HEAD = null;
			}else {
				lastNode = HEAD;
				while (lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();
				}
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
	}
	
	public void removeMid (int x) {
		Node preNode = new Node(0); 
		Node delNode;
		int i; boolean ketemu;
		
		if (HEAD != null) {
			ketemu = false;
			i = 1;
			delNode = HEAD;
			while(delNode.getNext() != null && !ketemu) {
				if (delNode.getData() == x) {
					ketemu = true;
				}else {
					preNode = delNode;
					delNode = delNode.getNext();
					i++;
				}
			}
			if (ketemu == true) {
				if(i == 1) {
					HEAD = null;
				}else {
					preNode.setNext(delNode.getNext());
					dispose(delNode);
				}
			}
		}
	}
	public boolean find (int x) {
		Node curNode;
		boolean ketemu = false;
		curNode = HEAD;
		ketemu = false;
		while (curNode != null && !ketemu) {
			if (curNode.getData() == x) {
				ketemu = true;
			}else {
				curNode = curNode.getNext();
			}
		}
		return ketemu;
	}
	public int size() {
		Node curNode;
		int jumlah;
		curNode = HEAD;
		jumlah = 0;
		while(curNode != null) {
			jumlah = jumlah+1;
			curNode = curNode.getNext();
		}
		return jumlah;
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
