package day1;

public class Cast1 {

	public static void main(String[] args) {
		//타입 변환 : 서로 다른 타입 있을 때 변환하는 것
		//자동 타입 변환 : 정수를 실수로 변환할 떄, 작은 범위를 큰 범위로 변환할 떄 
		//				 ↑자동으로 변환됨
		byte num1 = 1;
		int num2 = num1;
		double dnum1 = num2;
		//강제 타입 변환 : 자동 타입 변환이 안되는 경우, 강제로 변환시켜야 함.
		//변수나 값 앞에 (변수타입)을 써줘야 한다.
		int num3 = (int)1.23; //(int 변수타입 적어야함) 소수점 뺸다며 
		
		
		

	}

}
