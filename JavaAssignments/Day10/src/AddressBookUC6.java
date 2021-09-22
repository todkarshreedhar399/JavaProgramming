import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC6 {

	String firstName;
	String lastName;
	String city;
	String zipCode;
	String phone;
	String emailId;

	ArrayList<AddressBookUC6> addressbook = new ArrayList<>();

	static int count=0;
	public void setDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		this.firstName = scan.next();
		System.out.println("Enter last name");
		this.lastName = scan.next();
		System.out.println("Enter your city");
		this.city = scan.next();
		System.out.println("Enter zipCode");
		this.zipCode = scan.next();
		System.out.println("Enter phone number");
		this.phone = scan.next();
		System.out.println("Enter email id");
		this.emailId = scan.next(); 
	}

	public void display() {
		System.out.println("first name: " + firstName + " last name: " + lastName + " city: " + city + " zipCode: "
				+ zipCode + " phone: " + phone + " email id: " + emailId);
		System.out.println(" ");
	}

	public ArrayList<AddressBookUC6> editName(ArrayList<AddressBookUC6> addressbook) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String editName = scan.next();
		for (AddressBookUC6 i : addressbook) {
			String fName = i.firstName;
			if (editName.equalsIgnoreCase(fName)) {
				i.setDetails();
				i.display();
			} else {
				System.out.println("invalid name");
			}
		}
		return addressbook;
	}

	public ArrayList<AddressBookUC6> deleteContact(ArrayList<AddressBookUC6> addressbook) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String editName = scan.next();
		for (AddressBookUC6 i : addressbook) {
			String fName = i.firstName;
			if (editName.equalsIgnoreCase(fName)) {
				addressbook.remove(i);
				System.out.println("contact deleted successfully");
				break;
			} else {
				System.out.println("invalid name");
			}
		}
		return addressbook;
	}

	public ArrayList<AddressBookUC6> addDetails(ArrayList<AddressBookUC6> addressbook) {
		Scanner scan = new Scanner(System.in);
		System.out.println("check if the person record exist");
		String addName = scan.next();
		for (AddressBookUC6 i : addressbook) {
			String fName = i.firstName;
			if(count >0) {
				if (addName.equalsIgnoreCase(fName)) { 
					System.out.println("person already exist");
				} 
			}
			else {
				i.setDetails();
			}
			count++;
		}
		return addressbook;
	}
	
	public static void main(String[] args) {
		ArrayList<AddressBookUC6> addressbook = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice < 5) {
			System.out.println(
					"Enter \n1. Add contact \n2. display contacts \n3. edit contact \n4. delete contact \n5. Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				AddressBookUC6 addressBookUC6 = new AddressBookUC6();
				addressbook = addressBookUC6.addDetails(addressbook);
				
				break;
			case 2:
				for (AddressBookUC6 i : addressbook) {
					i.display();
				}
				break;
			case 3:
				AddressBookUC6 temp = new AddressBookUC6();
				addressbook = temp.editName(addressbook);
				break;
			case 4:
				AddressBookUC6 temp1 = new AddressBookUC6();
				addressbook = temp1.deleteContact(addressbook);
				break;
			}
			System.out.println("Good Bye!!!");
		}
	}
}
