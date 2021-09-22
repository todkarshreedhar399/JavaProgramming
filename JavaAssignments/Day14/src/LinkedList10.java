
public class LinkedList10 {
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

	public void insertsearchbetween(int value , int value2) {
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
	public void deletebetween(int value) {
		Node temp = head;
		int i = 1;
		while (temp != null) {
			Node prev=temp;
			temp = temp.next;
			if(temp.data == value) {	
				Node tempTwo = temp.next;
				prev.next= tempTwo;
				System.out.println(value+" is found at index "+i);
				break;
			}else {
				System.out.println("value not found");
			}
			
			i++;
		}
		
	}
	
	public void sort()
	{
		Node temp = head;
		int arr[] = new int[3];
		int i=0;
		while(temp!=null)
		{
			arr[i]=temp.data;
			temp=temp.next;
			i++;
		}
		for(int i1=0;i1<arr.length;i1++)
		{
			for(int i2=0;i2<i1;i2++)
			if(arr[i1]<arr[i2])
			{
				int temporary=arr[i1];
				arr[i1]=arr[i2];
				arr[i2]=temporary;
			}
		}
		this.head=null;
		this.tail=null;
		for(int i1=0;i1<arr.length;i1++)
		{
			Node node= new Node(arr[i1]);
			if (head == null) {
				head = node; // 56
				tail = node; // 56
			} else {
				tail.next = node; // 30 next -> 30
				tail = node; // 30
			}
			
		}
	}
 
	public static void main(String[] args) {
		LinkedList10 linkList = new LinkedList10();
		linkList.addNode(56);
		linkList.addNode(70);
		linkList.addNode(36);
		linkList.addNode(90);
		linkList.insertBetween(66, 2);
		linkList.display();
		System.out.println();
		linkList.deletefirst();
		linkList.display();
		System.out.println();
		linkList.deleteLast();
		linkList.display();
		System.out.println();
		linkList.insertsearchbetween(66,40);
		linkList.display();
		System.out.println();
		linkList.deletebetween(40);
		linkList.display();
		linkList.sort();
		System.out.println();
		System.out.println("After Sorting:");
		linkList.display();
	}
}
