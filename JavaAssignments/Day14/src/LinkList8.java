

public class LinkList8 {
	public Node head;
	public Node tail;

	public void addNode(int data) {
		Node node = new Node(data); // 56 //30 //70
		if (head == null) {
			head = node; // 56
			tail = node; // 56
		} else {
			tail.next = node; // 30 next -> 30
			tail = node; // 30
		}
	}

	public void insertBetween(int data, int index) {
		Node node = new Node(data);
		int i = 1;
		Node temp = head;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		Node tempTwo = temp.next;
		temp.next = node;
		node.next = tempTwo;

	}

	public void deletefirst() {
		Node temp = head;
		head = head.next;
	}

	public void deleteLast() {
		System.out.println("deleteLast");
		Node temp = head;
		Node secondLast = tail;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public void search(int value , int value2) {
		Node temp = head;
		int i = 1;
		while (temp != null) {
			if(temp.data == value) {	
				Node node = new Node(value2);
				Node tempTwo = temp.next;
				temp.next = node;
				node.next = tempTwo;
				System.out.println(value+" is found at index "+i);
				break;
			}else {
				System.out.println("value not found");
			}
			temp = temp.next;
			i++;
		}
		
	}

	public static void main(String[] args) {
		LinkList8 linkList = new LinkList8();
		linkList.addNode(56);
		linkList.addNode(70);
		linkList.addNode(36);
		linkList.addNode(90);
		linkList.insertBetween(66, 2);
		linkList.display();
		linkList.deletefirst();
		linkList.display();
		linkList.deleteLast();
		linkList.display();
		linkList.search(66,40);
		linkList.display();
	}
}
