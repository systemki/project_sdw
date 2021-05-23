package day15;

public class ArrayindexOutOfBounsExceptionTest {

	public static void main(String[] args) {
		int []arr = new int[5];
		//5개 짜리 배열은 0번지 부터 4번까지 접근할 수 있는데 
		//5번지에 접급하려해서 에러 발생 
		for(int i = 0 ; i <=arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
