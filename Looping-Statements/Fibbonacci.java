package LoopingStatements;
import java.util.Scanner;
public class Fibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c=a+b;
		for( int i = 0;i<n;i++) {
			if (i==n) {
				System.out.println(a);
			}

			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
