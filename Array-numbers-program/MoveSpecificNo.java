package ArrayNumberPrograms;

import java.util.Arrays;

public class MoveSpecificNo {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,2,1,2,1};
		int n = 1;
		int j = 0 ;
		for (int i = 0 ; i <arr.length ; i++){
			if(arr[i] !=n ) {
				arr[j] = arr[i];
				j++;
			}
		}
		for(int k = j ; k <arr.length ; k++) {
			arr[k] = n;
			}
			System.out.println(Arrays.toString(arr));	
	}
	
	}


