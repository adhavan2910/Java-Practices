package ArrayNumberPrograms;

public class DuplicateInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,2,3,3,1,4};
		
		for(int i = 0; i<arr.length;i++) {
			boolean isDuplicate = false;
			boolean alreadyPrinted = false;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {					
					isDuplicate = true; 
					break;
				}
				
			}
			for(int k = 0;k<i;k++) {
				if(arr[k] == arr[i]) {
					alreadyPrinted=true;
					break;
				}
			}
			if((isDuplicate == true)&&(alreadyPrinted == false )) {
				System.out.println(arr[i]);
				
			}
		}
	
		
	}

}
