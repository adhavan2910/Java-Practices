//interview method

package LoopingStatements;
public class FactorialAscending {
	  public static int factorial(int n) {
	        int result = 1;
	        	while(n>2)
	        {
	            result = result * n;
	            n--;
	        }
	        	return result;	  
	        	}
}
