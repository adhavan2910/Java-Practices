package LoopingStatements;
import java.util.Scanner;
class PalindromeCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the startinng value:");
		int st=sc.nextInt();
		System.out.println("Enter the ending value:");
		int en=sc.nextInt();
		int rev=0;
		for(int i=st;i<=en;i++) {
			int temp=i;
			int n=i;
			while(n!=0) {
				int d=n%10;
				rev=(rev*10)+d;
				n/=10;
			}if(rev==temp) {
				System.out.println(rev);
				System.out.println("Palindrome");
			}
			else {
				System.out.println(rev);
				System.out.println("Not Palindrome");
		}rev=0;
	}
	

}
}
