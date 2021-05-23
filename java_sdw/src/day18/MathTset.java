package day18;

public class MathTset {

	public static void main(String[] args) {
		//abs() :  절대값 구하는 메소드
		System.out.println(Math.abs(-1));
		System.out.println(Math.abs(-1.23));
		//ceil() : 올림
		System.out.println(Math.ceil(1.1));
		//floor() :내림
		System.out.println(Math.floor(1.9));
		//rint() : 가까운 정수갑의 실수 
		System.out.println(Math.rint(1.2));
		//round() : 반올림한 정수값
		System.out.println(Math.round(1.2));
		//max() : 최대값
		System.out.println(Math.max(1.23, 1.24));
		//min() : 최소값
		System.out.println(Math.min(1.23, 1.24));
		//ramdom() :0보다 크거 같고1보자 작은 임이 실수값 생성하는 메소드
		System.out.println(Math.random());
		//pow(a,b) : a의 b제곱
		System.out.println(Math.pow(2, 3));
		//sqrt(a) : 루트a
		System.out.println(Math.sqrt(4));
	}

}
