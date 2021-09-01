import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the alphabet : ");
	       String str=sc.nextLine();
	       char first = str.charAt(0);   
	       vowelsconsonants(first);
	       
	}
	static void vowelsconsonants(char first)
	{
		int ascii=first;
	       if(first=='a' || first=='e' || first=='i' || first=='o' || first=='u'|| first=='A' || first=='E' || first=='I' || first=='O' || first=='U') 
	       {
	    	   System.out.println(first +" : Its a Vowel");
	       }
	       else if(ascii >=65 && ascii <=122 )
	       {
	    	   System.out.println(first +" : Its a Consonant");
	       }
	       else
	       {
	    	   System.out.println(first+ ": Its not even an Alphabet.Try again");
	       }
	}

}
/*Output
Q1: Enter the alphabet : 
D
D : Its a Consonant
Q2: Enter the alphabet : 
A
A : Its a Vowel
*/