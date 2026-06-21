package LoopingStatements;
import java.util.Scanner;
public class PalindromeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int st = sc.nextInt();
		System.out.println("Enter the ending number");
		int end = sc.nextInt();
		
		
		int rev=0;
		for(int i=st;i<=end;i++) {
			int temp=i;
			int n=i;
			while(n!=0) {
				int d=n%10;
				rev=(rev*10)+d;
				n/=10;
			}if(rev==temp) {
				System.out.println(temp+"is"+rev);
				System.out.println("Palindrome");
			}
			else {
				System.out.println(temp+"is"+rev);
				System.out.println("Not Palindrome");
		}rev=0;
		
				
	}
	}
}
