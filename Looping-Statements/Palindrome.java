package LoopingStatements;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(n!=0) {
			int r = n%10;
			rev = (rev*10)+r;
			n/=10;
		}
		if(temp ==rev) {
			System.out.println("The number is PALINDROME");
		}
		else {
			System.out.println("The number is NOT PALINDROME");
		}
	}
}

