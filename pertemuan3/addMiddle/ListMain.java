package pertemuan3.addMiddle;

public class ListMain {
	static void testLat3() {
		StrukturList list = new StrukturList();
		list.addHead(5);
		list.addHead(4);
		list.addHead(3);

		list.displayElement();
	}
	static void testLat3_2() {
		StrukturList list = new StrukturList();
		list.addHead(5);
		list.addHead(4);
		list.addHead(3);

		list.displayElement();
	}
	static void testLat5() {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addMid(7,2);
		list.addMid(8,2);
		list.addHead(5);

		list.displayElement();
	}
	public static void main(String[] args) {
		testLat5();
	}
}
