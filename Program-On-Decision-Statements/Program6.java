package ProgramsOnDecisionStatements;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter variable 1:");
		double a = sc.nextDouble();
		System.out.println("Enter variable 2:");
		double b = sc.nextDouble();
		System.out.println("Enter variable 3:");
		double c = sc.nextDouble();
		double sq = (b*b) - (4*a*c);
		
		if(sq>0) {
			double r1 = ((-b) - Math.sqrt(sq)) / (2*a);
			double r2 = ((-b) + Math.sqrt(sq)) / (2*a);
			
			System.out.println("Root 1:"+ r1);
			System.out.println("Root 1:"+ r2);
		}
		else { 
			System.out.println("Invalid input");
			
		}
	}
}
		
		
		
	

