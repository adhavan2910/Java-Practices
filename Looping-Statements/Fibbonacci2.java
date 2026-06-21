package LoopingStatements;
import java.util.Scanner;
public class Fibbonacci2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c=a+b;
		for( int i = 0;i<n;i++) {

			a=b;
			b=c;
			c=a+b;
			
		}
		System.out.println(a);
	}

}
