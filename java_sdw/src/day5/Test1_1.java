package day5;

public class Test1_1 {

	public static void main(String[] args) {
		int num = 12, i;
		int [] arr = new int [10];
		int cnt = 0; //저장된 약수의 개수 
		for(i = 1; i <= num ; i+= 1) {
			if(num % i == 0) {
				arr[cnt] = i; //cnt번지에 i를 저장 후 
				cnt +=1; //cnt 1 증가 후 
				if(cnt == 10) { // cnt가 10과 같으면  
					break; // 반복문 종료
				} 
			}
			
		} for(i = 0; i <cnt ; i +=1 ) { //배열에 있는 값을 0번지 부터 
			System.out.println(arr[i]+""); //cnt 출력 i로 저장해서 i로 출력 
		}
		

	}

}
