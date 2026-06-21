package ArrayNumberPrograms;
import java.util.*;
public class SumOfOddIndex {

		public static int EvenIndex(int[] arr) {
			int sum = 0;
			for(int i = 0; i<arr.length ; i++) {
				if(i%2 != 0) {
					sum += arr[i]; 
				}
			}
				return sum;
			}
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,6,6,8};
			System.out.println(EvenIndex(arr));
		}
		
		}



