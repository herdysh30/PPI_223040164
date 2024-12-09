package pertemuan2.List;

public class ListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addHead(3);
		list.addHead(4);
		list.addHead(5);
		
		System.out.println("Elemen :");
		list.displayElement();
	}
}
