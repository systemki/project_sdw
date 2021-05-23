package day11;

public class Test1 {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A(1,2);
		//A a3 = new A(1.0, 2); //실수가 정수로 자동변환이 안되기 떄문에 에러
		A a4 = new A('a',3);  // 문자가 정수로 자동변환이 되기 떄문에 에러 X
	}

}

class A{
	private int num1; // 멤버 변수 주로 쓴다
	private int num2;
	public void A() {} // 생성자와 이름이 같은 메소드  주로 메스드 사용 
	public A() {}
	
		

	public A(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	 public A(A a){
	  num1 = a.num1;
	  num2 = a.num2;
	  
	  }
	 
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}

}