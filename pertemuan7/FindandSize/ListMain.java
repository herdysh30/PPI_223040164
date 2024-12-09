package pertemuan7.FindandSize;

public class ListMain {

	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addHead(1);
		list.addHead(8);
		list.addHead(0);
		list.addHead(3);
		System.out.println("Hasil pencarian : "+list.find(1));
		System.out.println("Hasil pencarian : "+list.find(2));
		System.out.println("Ukuran Node : "+list.size());
	}
}
