package ArrayNumberPrograms;
import java.util.*;
public class MaxOfArray {
		public static int min(int[] arr) {
			int max = Integer.MIN_VALUE;
			for(int i = 0;i>arr.length; i++) {
				if (arr[i]>max) {
					max = arr[i];
					
				}
			}
			return max == Integer.MIN_VALUE ? max : -1;
			
		}
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,90,89};
			System.out.println(min(arr));
		}
	}


