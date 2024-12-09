package pertemuan10.PostFix;

public class ParsePost {
	private MyStack stack;
	private String input;
	
	public ParsePost(String input) {
		super();
		this.input = input;
	}
	public int doParse() {
		stack = new MyStack(20);
		char ch;
		int i;
		int bill, bill2, hasilOps;
		
		for(i=0;i<input.length();i++) {
			ch=input.charAt(i);
			stack.displayStack("" +ch+ " ");
			if(ch >= '0' && ch <='9') {
				stack.push((int)(ch-'0'));
			}else {
				bill2 = stack.pop();
				bill = stack.pop();
				switch(ch) {
					case '+': hasilOps = bill+bill2;break;
					case '-': hasilOps = bill-bill2;break;
					case '*': hasilOps = bill*bill2;break;
					case '/': hasilOps = bill/bill2;break;
					default:hasilOps = 0;
				}
				stack.push(hasilOps);
			}
		}
		hasilOps = stack.pop();
		return hasilOps;
	}
	
}
