package LoopingStatements;

public class Strong {
	public static int fact(int n){
		int fact = 1;
		for (int i = 1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static boolean isStrong(int n) {
		int temp = n;
		int sum = 0;
		while(n!=0) {
			int r = n%10;
			sum+=fact(r);
			n/=10;
		}
		return sum == temp;
		
	}
	public static void main(String[] args) {
		System.out.println(isStrong(145));
	}
}

