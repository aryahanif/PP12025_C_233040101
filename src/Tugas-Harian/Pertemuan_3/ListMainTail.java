package Pertemuan3;

public class ListMainTail {
	
	public static void main(String[] args) {
		// 1. Create list dengan keyword new
		StrukturList list = new StrukturList();
		
        // 2. Tambah elemen 3 di akhir list
		list.addTail(3);
		
        // 3. Tambah elemen 4 di akhir list
		list.addTail(4);
		
        // 4. Tambah elemen 5 di akhir list
		list.addTail(5);
		
        // 5. Tampilkan elemen list
		System.out.println("Elemen: ");
		list.displayElement();
	}

}
