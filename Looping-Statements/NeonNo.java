package LoopingStatements;

public class NeonNo {
	public static boolean isNeon(int n) {
		int temp = n;
		int sum = 0;
		int r = 0;
		int sq = n*n;
		
		while(sq!=0) {
			r = sq % 10;
			sum = sum + r;
			sq =  sq/10;
		}
		
	
		return sum == temp;
}
	public static void main(String[] args) {
		System.out.print(isNeon(9));
	}
}
