package pertemuan7.ListTipeKelas;

public class ListMatakuliah {
	private Node HEAD;
	public boolean isEmpty() {
		return (HEAD == null);
	}
	public void addHead(Matakuliah data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	public void addTail (Matakuliah data) {
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
	public void addMid (Matakuliah data, int position) {
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
		
		if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }else {
        	Node curNode = HEAD;
        	while (curNode != null) {
        		System.out.println("Matakuliah : "+curNode.getData().getKode()+" "+curNode.getData().getNama()+" "+curNode.getData().getSks());
        		curNode = curNode.getNext();
        	}
        	System.out.println();
        }
	}
}
