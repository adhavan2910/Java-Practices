package ArrayNumberPrograms;
import java.util.Arrays;
public class RightShift {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int i = arr.length - 1; i > 0;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0] = 0;
		System.out.println(Arrays.toString(arr));
	}
}
