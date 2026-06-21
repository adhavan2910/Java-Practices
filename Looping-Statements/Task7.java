package LoopingStatements;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter value");
		int num = n.nextInt();
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			sum += digit;
			num/=10;
		}
		System.out.println("The sum is:"+ sum);
		n.close();
		}
		
	}


