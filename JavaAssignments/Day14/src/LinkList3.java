

public class LinkList3 {
	public Node head;
	public Node tail;

	public void append(int data) {
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
		LinkList3 linkList = new LinkList3();
		linkList.append(56);
		linkList.append(30);
		linkList.append(70);
		linkList.display();
	}
}
