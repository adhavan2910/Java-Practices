package ArrayNumberPrograms;
import java.util.*;
public interface MinOfArray {
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
				
			}
		}
		return min == Integer.MAX_VALUE? -1 : min;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4-90,89};
		System.out.println(min(arr));
	}
}
