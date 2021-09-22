import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC3 {

	String firstName;
	String lastName;
	String city;
	String zipCode;
	String phone;
	String emailId;

	public void getDetails() {
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

	public void editDetails(AddressBookUC3 person1, AddressBookUC3 person2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the person name you want edit");
		String editName = scan.next();
		if (editName.equalsIgnoreCase(person1.firstName) || editName.equalsIgnoreCase(person2.firstName)) {
			if (editName.equalsIgnoreCase(person1.firstName)) {
				person1.getDetails();
				System.out.println("updated details of person1");
				person1.display();
			} else if (editName.equalsIgnoreCase(person2.firstName)) {
				person2.getDetails();
				System.out.println("updated details of person2");
				person2.display();
			}
		}
	}

	public static void main(String[] args) {
		AddressBookUC3 person1 = new AddressBookUC3();
		person1.getDetails();
		System.out.println("enter details of next person");
		AddressBookUC3 person2 = new AddressBookUC3();
		person2.getDetails();
		person1.display();
		person2.display();
		
		AddressBookUC3 editDetails = new AddressBookUC3();
		editDetails.editDetails(person1, person2);

	}

}
