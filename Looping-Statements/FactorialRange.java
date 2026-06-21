package LoopingStatements;
import java.util.Scanner;
public class FactorialRange {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting no:");
	int st=sc.nextInt();
	System.out.println("Enter the ending no:");
	int en=sc.nextInt();
	int fact=1;
	for(int i=st;i<=en;i++) {
		int temp=i;
		for (int j=temp;j>=1;j--) {
			fact*=j;
		}System.out.println(temp+":"+""+fact);
		fact=1;
	}
}

}
