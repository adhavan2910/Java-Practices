package operators;

public class Rtrn{
	public static void main(String[] args) {
		System.out.println(add(10,2));
		System.out.println(sub(10,2));
		System.out.println(mult(10,2));
		System.out.println(div(10,2));
	}
	
	public static int add(int a,int b) {
		return (a + b);
	}
	
	public static int sub(int a,int b) {
		return (a - b);
	}
	
	public static int mult(int a,int b) {
		return (a * b);
	}
	
	public static int div(int a,int b) {
		return (a / b);
	}
	
}
	
	