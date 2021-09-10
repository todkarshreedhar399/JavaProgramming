import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC5 {

	String firstName;
	String lastName;
	String city;
	String zipCode;
	String phone;
	String emailId;

	ArrayList<AddressBookUC5> addressbook = new ArrayList<>();

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

	public ArrayList<AddressBookUC5> editName(ArrayList<AddressBookUC5> addressbook) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String editName = scan.next();
		for (AddressBookUC5 i : addressbook) {
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

	public ArrayList<AddressBookUC5> deleteContact(ArrayList<AddressBookUC5> addressbook) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String editName = scan.next();
		for (AddressBookUC5 i : addressbook) {
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

	public static void main(String[] args) {
		ArrayList<AddressBookUC5> addressbook = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (choice < 5) {
			System.out.println(
					"Enter \n1. Added contact \n2. display contacts \n3. edit contact \n4. delete contact \n5. Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the no.of contacts you want to add");
				int records = scan.nextInt();
				for (int i = 0; i < records; i++) {
					if (i > 0) {
						System.out.println("enter the first name to check if it alreadt exist");
						String editName = scan.next();
						if (editName.equalsIgnoreCase(addressbook.get(i).firstName)) {
							System.out.println("person already exist");
							break;
						} else {
							System.out.println("enter contact details of person: " + (i + 1));
							AddressBookUC5 contacts = new AddressBookUC5();
							contacts.setDetails();
							addressbook.add(contacts);
						}
					}
				}
				break;
			case 2:
				for (AddressBookUC5 i : addressbook) {
					i.display();
				}
				break;
			case 3:
				AddressBookUC5 temp = new AddressBookUC5();
				addressbook = temp.editName(addressbook);
				break;
			case 4:
				AddressBookUC5 temp1 = new AddressBookUC5();
				addressbook = temp1.deleteContact(addressbook);
				break;
			}
			System.out.println("Good Bye!!!");
		}
	}
}
