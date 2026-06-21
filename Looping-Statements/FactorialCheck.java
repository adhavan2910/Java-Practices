package LoopingStatements;
import java.util.Scanner;
public class FactorialCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		boolean b=false;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
			if (fact==n) {
					b=true;
					break;
				}
		
		}if (b) {
			System.out.println("The given no is factorial of another no");
		}else {
			System.out.println("The given no is not a factorial of another no");

}
}
}