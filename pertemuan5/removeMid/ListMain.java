package pertemuan5.removeMid;

public class ListMain {

	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addHead(1);
		list.addHead(5);
		list.addHead(3);
		list.addHead(6);
		list.addHead(2);
		list.displayElement();
		list.removeMid(3);
		System.out.println("");
		list.displayElement();
		list.removeMid(6);
		list.removeMid(5);
		System.out.println("");
		list.displayElement();
	}
}
