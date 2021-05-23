package day12;

public class InheritanceTest2 {

	public static void main(String[] args) {
	SmartPhone sp = new SmartPhone("010-1234-5678","빨강","아이폰11");
	sp.print();

	}

}


// 폰 클래스

class Phone{
	String num;
	String color;
	String model;
	public Phone(String num, String color, String model) {
		this.num = num;
		this.color = color;
		this.model = model;
	}
	public Phone() {}
	public void print() {
	System.out.println("번호 : " + num);
	System.out.println("색상 : " + num);
	System.out.println("모델 : " + num);
}
	
}
	

//스마트 폰 클래스 

class SmartPhone extends Phone{
	int camera; // 카메라 화소( 단위 만)
	public 	SmartPhon(String num, String color, String model) {
		this.num = num;
		this.color = color;
		this.model =  model;
	}
	
}


