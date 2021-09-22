

public class LinkList2 {
	public Node head;
	public Node tail;

	public void addFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;  
			tail = node; 
		} else { 
			Node temp = head;
			head = node;
			head.next = temp;
//			node.next = head;
//			head = node;
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
		LinkList2 linkList = new LinkList2();
		linkList.addFirst(70);
		linkList.addFirst(30);
		linkList.addFirst(56);
		linkList.display();
	}
}
