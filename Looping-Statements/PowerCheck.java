package LoopingStatements;
import java.util.Scanner;
public class PowerCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		double n=sc.nextInt();
		boolean f=false;
		for (double i=1;i<=n/2;i++) {
			if (Math.pow(2, i)==n) {
				f=true;
				break;
				}
		}if (f) {
			System.out.println("It is power of two");
		}else {
			System.out.println("It is not power of two");
		}
	}
	}
