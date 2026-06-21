package ProgramsOnDecisionStatements;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter:");
		char ch = sc.next().charAt(0);
		if(ch>=65 && ch<=90) {
			System.out.println("UPPERCASE");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("LOWERCASE");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}
	

}
