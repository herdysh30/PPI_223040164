package pertemuan1.Node;

public class Node {
	private int nilai;
	private Node next;
	
	//inisialisasi Node
	public Node (int nilai) {
		this.nilai = nilai;
	}
	
	//setter getter
	public void setNext (Node next) {
		this.next = next;
	}
	public Node getNext () {
		return next;
	}
	public void setNilai (int nilai) {
		this.nilai = nilai;
	}
	public int getNilai() {
		return nilai;
	}

}