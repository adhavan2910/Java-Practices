package ProgramsOnDecisionStatements;
import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("ENTER A CHARECTER:");
		char ch = sc.next().charAt(0);
		if(ch>='A'&& ch<='Z')
			System.out.println("Alphabet");
				{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("Upper case vowel");
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("Lower case vowel");
			}
		else if(ch>='0' && ch<='9') {
			System.out.println("number");
		}
			else {
			System.out.println("Special charecter");
		}
	}
		
				
	}
			
			
			

	

}
