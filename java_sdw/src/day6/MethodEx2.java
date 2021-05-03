package day6;

public class MethodEx2 {

	public static void main(String[] args) {
	 int arr[] = new int[] {1,2,3,4,5};
	 printArray(arr);
	 initArray(arr,1);
	printArray(arr);
	}



 /* 기능 : 	정수 배열에 있는 모든 원소값을 출력 하는 메소드
 매개변수 : 정수 배열  =  int arr [] 
 리턴타입 : 없음 >= 보이드 
 메스드명 : printArray
*/

public static void printArray(int arr[]) {

	/* 배열이나 컬렉션 프레임 워크 
	 * 전체를 탐색
	 * 수정이 아닌 경우 
	 *  */
	
	for(int temp: arr) {
		System.out.print(temp + " " );
	}
	System.out.println();
}

/* 기능 :  배열에 지정된 정수로 모두 초기화하는 메소드
매개변수 :  배열, 지정된  정수 
리턴타입 : x
메소드명 : initArray
*/
				//		배열에 지정된 정수로  
	public static void initArray (int arr[], int num) {
	// 예외처리, 배열이 생성이 안된 경우 메소드를 조욜 합니다.
		if(arr == null) {
			return;
		}
		int i;
		for(i = 0 ; i<arr.length; i+=1) {
			arr[i] = num;
		}
	}
	
	



}