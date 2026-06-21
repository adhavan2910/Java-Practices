package LoopingStatements;

public class Armstrong {
	public static int CountDigits(int n) {
		int count = 0;
		while(n!=0) {
			count = n%10;
			count++;
		}
		return count;
	}
	public static int pow(int a, int b) {
		int pro = 1;
		int pow = 1;
		for(int i =1; i<= pow;i++) {
			pro = pro * a;
		}
		return pro;
	}
	public static boolean isArmStrong(int n) {
		int count = CountDigits(n);
		int temp = n;
		int sum = 0;
		while(n!=0) {
			int r = n%10;
			sum+=pow(r,count);
			n/=10;
		}
		return temp == sum;
	}
	public static void main(String[] args) {
		System.out.println(isArmStrong(153));
	
		
		
		
		
		
	
	}
}

