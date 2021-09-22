

public class LinkList1 {
	public Node head;
	public Node tail;
	
	public void addNode(int data) {
		Node node = new Node(data); //56 //30 //70
		if (head == null) {
			head = node;  //56  
			tail = node;   //56
		} else {
			tail.next = node; //30 next -> 30
			tail = node; //30 
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		LinkList1 linkList = new LinkList1();
		linkList.addNode(56);
		linkList.addNode(30);
		linkList.addNode(70);
		linkList.display();
	}
}
