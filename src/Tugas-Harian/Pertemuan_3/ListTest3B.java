package Pertemuan3;

public class ListTest3B {
	
	public static void main(String[] args) {
		// 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 7 di awal list
        list.addHead(7);

        // 3. Tambah elemen 5 di awal list
        list.addHead(5);

        // 4. Tambah elemen 4 di awal list
        list.addHead(4);
        
        // 4. Tambah elemen 1 di awal list
        list.addHead(1);

        // 6. Tampilkan elemen list
        System.out.println("Elemen list:");
        list.displayElement();
	}

}
