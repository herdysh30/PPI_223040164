package pertemuan9.stack;

public class StackMain {
	public static void main(String[] args) {
		StrukturStack ss = new StrukturStack(3);
		System.out.println("#Sebelum Push");
		System.out.println("Size : "+ss.size());
		System.out.println("Empty : "+ss.isEmpty());
		System.out.println("Full : "+ss.isFull());
		System.out.println("Top : "+ss.top());
		ss.displayElement();
		System.out.println();
		
		System.out.println("#Melakukan push 3x");
		ss.push(2);
		System.out.print("push 2; ");
		ss.push(4);
		System.out.print("push 4, ");
		ss.push(1);
		System.out.println("push 1");
		System.out.println("Size : "+ss.size());
		System.out.println("Empty : "+ss.isEmpty());
		System.out.println("Full : "+ss.isFull());
		System.out.println("Top : "+ss.top());
		ss.displayElement();
		System.out.println();
		
		System.out.println("#Setelah Pop");
		ss.pop();
		System.out.println("Size : "+ss.size());
		System.out.println("Empty : "+ss.isEmpty());
		System.out.println("Full : "+ss.isFull());
		System.out.println("Top : "+ss.top());
		ss.displayElement();
		System.out.println();
	}
}
