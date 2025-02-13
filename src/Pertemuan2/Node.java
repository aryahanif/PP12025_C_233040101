package Pertemuan2;

public class Node {
	private int  nilai;
	private Node next;
	
	//inisialisasi Node
	public Node(int nilai) {
		this.nilai = nilai;
		this.next = null;
	}
	
	//setter and getter
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public int getNilai() {
		return nilai;
	}
	
	//setter untuk next
	public void setNext(Node next) {
        this.next = next;
    }

	//getter untuk next
	public Node getNext() {
        return next;
    }
}
