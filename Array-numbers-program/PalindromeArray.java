package ArrayNumberPrograms;
import java.util.*;
public class PalindromeArray {
	public static boolean isPalindrome(int[] arr) {
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i] != arr[arr.length -1 -i])
				return false;
			}
		return true;
		}
	public static void main(String[] args) {
		int[] arr = {1,2,0,2,1};
		System.out.println(isPalindrome(arr));
	}
}
