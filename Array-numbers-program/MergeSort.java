package ArrayNumberPrograms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
	
		int[] arr1 = {20,1000,2000};
		int[] arr2 = {-23,5,100,160,195,2000};
		int[] res = new int[arr1.length +arr2.length];
		int i = 0 ,j = 0, k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
			while(i<arr1.length) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length) {
				res[k] = arr2[j];
				j++;
				k++;
			}
			System.out.println(Arrays.toString(res));
		}
	}



