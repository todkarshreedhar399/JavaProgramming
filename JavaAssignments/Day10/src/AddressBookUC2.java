import java.util.Scanner;

public class AddressBookUC2 {

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

	private void display() {
		System.out.println("first name: " + firstName + " last name: " + lastName + " city: " + city + " zipCode: "
				+ zipCode + " phone: " + phone + " email id: " + emailId);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		AddressBookUC2 person1 = new AddressBookUC2();
		person1.getDetails();
		AddressBookUC2 person2 = new AddressBookUC2();
		person2.getDetails();
		person1.display();
		person2.display();
	}

}
