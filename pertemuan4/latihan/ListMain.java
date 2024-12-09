package pertemuan4.latihan;

public class ListMain {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(8);
		list.addTail(7);
		list.addTail(6);
		list.addMid(3,1);
		list.addMid(6,2);
		list.addHead(9);

		list.displayElement();
	}
}

