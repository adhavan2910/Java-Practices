package ArrayNumberPrograms;

import java.util.Arrays;

public class MergeArray {
public static void main(String[] args) {
	int arr[] = {10,20};
	int arr2[] = {5,7};
	int[] result =new int[arr.length + arr2.length];
	int index = 0;
	for(int i = 0;i<arr.length;i++) {
		result[index] = arr[i];
		index++;
	}
	for(int i = 0;i<arr2.length;i++) {
		result[index] = arr2[i];
		index++;
		}
	System.out.println(Arrays.toString(result));
	
}
}
