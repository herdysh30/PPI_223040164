package pertemuan7.ListTipeKelas;

public class ListMkTest {
	public static void main(String[] args) {
		ListMatakuliah list = new ListMatakuliah();
		list.addHead(new Matakuliah("IF001", "Dasar Pemrograman",4));
		list.addHead(new Matakuliah("IF002", "Pemrograman Web",3));
		list.addHead(new Matakuliah("IF003", "Struktur Diskrit",3));
		list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek",4));
		list.displayElement();

	}
}


