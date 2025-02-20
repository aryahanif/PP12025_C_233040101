package Pertemuan3;

public class ListMainHead {
	
	public static void main(String[] args) {
		// 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 5 di awal list
        list.addHead(5);

        // 3. Tambah elemen 4 di awal list
        list.addHead(4);

        // 4. Tambah elemen 3 di awal list
        list.addHead(3);

        // 5. Tampilkan elemen list
        System.out.println("Elemen list:");
        list.displayElement();
	}

}
