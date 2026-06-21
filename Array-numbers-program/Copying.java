package ArrayNumberPrograms;
import java.util.*;
public class Copying {
	public static int[] copying(int[] arr) {
		int[] arr2 = new int[arr.length];
		for(int i = 0 ; i<arr.length ; i++) {
		arr2[i] = arr[i];
	}
	return arr2;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,2,1};
		int[] res = copying(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		System.out.println(arr == res);
	}

}
