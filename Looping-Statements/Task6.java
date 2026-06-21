package LoopingStatements;
import java.util.Scanner;
class Task6 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter value");
		int num = n.nextInt();
		int m = 1;
		while(num>0) {
			int digit = num%10;
			m *= digit;
			num/=10;
		}
		System.out.println("The sum is:"+m);
		n.close();
		}
		
	}


