package Pertemuan3;

public class ListTest3A {
	
	public static void main(String[] args) {
		// 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 1 di awal list
        list.addHead(1);

        // 3. Tambah elemen 2 di awal list
        list.addHead(2);

        // 4. Tambah elemen 3 di awal list
        list.addHead(3);

        // 5. Tampilkan elemen list
        System.out.println("Elemen list:");
        list.displayElement();
	}

}
