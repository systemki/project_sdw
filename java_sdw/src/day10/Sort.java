package day10;

public class Sort {

	public static void main(String[] args) {
		
		/* 배열 정렬 : 버블 정렬  
		 - 옆에 요소와 비교하여 정렬 하는 방법
		 - 5 4 6 9 8 7 10
		 - 4 5 6 9 8 7 10
		 */
		
		int arr[] = new int[] {5, 4, 6, 9, 8, 7, 10};
		printArray(arr);
		System.out.println();
		for(int i = 0; i < arr.length -1; i +=1) {
			for(int k = 0; k < arr.length -1 - i ; k+=1) {
				if(arr[k] > arr[k+1]) {
					int tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
					
				}
				printArray(arr);
				System.out.println();
			}
		}
		printArray(arr);
		
	}
	public static void printArray(int []arr) {
		for(int i = 0 ; i<arr.length; i+=1) {
			System.out.print(arr[i] +" ");
		}
	}

}
