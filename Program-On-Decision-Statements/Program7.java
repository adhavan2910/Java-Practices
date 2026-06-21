package ProgramsOnDecisionStatements;
import java.util.Scanner;
public class Program7 {
	public static void main(String[] args) {
		System.out.println("MARK & GRADE");
		Scanner sc = new Scanner(System.in);
		System.out.println("PHYSICS:");
		int m1 = sc.nextInt();
		System.out.println("CHEMISTRY:");
		int m2 = sc.nextInt();
		System.out.println("BIOLOGY:");
		int m3 = sc.nextInt();
		System.out.println("MATHS:");
		int m4 = sc.nextInt();
		System.out.println("COMPUTER SCIENCE:");
		int m5 = sc.nextInt();
		double total = m1+m2+m3+m4+m5;
		double perc = total/5;
		if(perc>90) {
			System.out.println("Grade A");
		}
		else if(perc>80){
			System.out.println("Grade B");
		}
		else if(perc>70) {
			System.out.println("Grade c");
		}
		else if(perc>60) {
			System.out.println("Grade D");
		}
		else if(perc>40) {
			System.out.println("Grade E");
		}
		else {
			System.out.println("Grade F");
		}
	}
	

}
