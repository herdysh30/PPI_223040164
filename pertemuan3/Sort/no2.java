package pertemuan3.Sort;

public class no2 {
	static int [] data = {4,7,6,2,8,3};
	static void sort() {
		int temp;
		int i,j;
		
		
		for (i=0;i<data.length-1;i++) {
			System.out.println("Pernyataan-1");
			for(j=0;j<(data.length-1)-i;j++) {
				if(data[j]>data[j+1])
				{
					System.out.println("Pernyataan-2");
					
					temp = data[j];
					data[j]=data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	static void tampilArray() {
		for(int a=0; a< data.length;a++) {
			System.out.println(data[a]);
		}
	}
	public static void main(String[] args) {
		sort();
		
		tampilArray();
	}
}
