package pertemuan5.removeHeadTail;

public class ListMain {
	static void lat2(){
		StrukturList list = new StrukturList();
		list.addHead(2);
		list.addHead(9);
		list.addHead(7);
		list.displayElement();
		list.removeHead();
		System.out.println("");
		list.displayElement();
	}
	static void lat4() {
		StrukturList list = new StrukturList();
		list.addHead(6);
		list.addHead(2);
		list.addMid(3,3);
		list.addTail(5);
		list.addTail(1);
		list.displayElement();
		System.out.println("");
		list.removeTail();
		list.displayElement();
		System.out.println("");
		list.removeHead();
		list.displayElement();
		System.out.println("");
		list.removeTail();
		list.displayElement();
	}
	public static void main(String[] args) {
		System.out.println("Latihan 2");
		lat2();
		System.out.println("");
		System.out.println("Latihan 4");
		lat4();
	}
}
