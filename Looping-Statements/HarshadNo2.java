package LoopingStatements;
import java.util.Scanner;
public class HarshadNo2 {
	public static boolean isHarshad(int n) {
		int temp = n;
		int sum = 0;
		int r = 1;
		while(n!=0){
			r %= 10;
			sum = sum + r;
			n/=10;
			}
		if(temp%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isHarshad(19));
	}
		
	}


