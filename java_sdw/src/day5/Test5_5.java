package day5;

public class Test5_5 {

	public static void main(String[] args) {
		// 1부터 10 사이에의 램덤한 수를 6개  생성하여 배열에 저장한후 출력하는 코드를 작성
		// 단 생성된 램던한 수는 중복될수 있음
		
		int min = 1, max = 10; // 1부터 10 사이에의
		int i, r;
		int [] arr = new int[6];	
		for( i = 0 ;  i <= arr.length ;  i+=1 ) { 
			r = (int)(Math.random() * (max - min + 1) +min);
		arr[i] = r;
		} 
		
		for(i = 0 ; i < arr.length; i +=1) {
			System.out.println(arr[i] + " ");			
		}	
	}

}