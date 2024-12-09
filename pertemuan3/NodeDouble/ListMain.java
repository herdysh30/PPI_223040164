package pertemuan3.NodeDouble;

public class ListMain {

	public static void main(String[] args) {
		StrukturList list = new StrukturList();

		list.addTail(3.7);
		list.addTail(4.3);

        list.addMid(7.3, 2);
        list.addMid(8.9, 2);

        list.addHead(5.1);

		list.displayElement();
	}
}
