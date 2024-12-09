package pertemuan8.Queue;

public class QueueMain {
	public static void main(String[] args) {
		StrukturQueue sq = new StrukturQueue();
		System.out.println("Front :"+sq.front());
		System.out.println("size : "+sq.size());
		System.out.println("REAR :"+sq.rear());
		System.out.println("isEmpty : "+sq.isEmpty());
		sq.enqueue(2);
		sq.enqueue(5);
		sq.enqueue(7);
		sq.enqueue(4);
		sq.enqueue(1);
		sq.displayElement();
		System.out.println("Front :"+sq.front());
		System.out.println("size : "+sq.size());
		System.out.println("REAR :"+sq.rear());
		System.out.println("isEmpty : "+sq.isEmpty());
		
		System.out.println();
		

	}
}