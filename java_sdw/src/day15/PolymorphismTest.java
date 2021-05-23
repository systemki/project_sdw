package day15;

// 인터페이스의 다형성
public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.frontLeft.roll();
		car.frontRight.roll();
		repair(car.frontLeft);
		repair(car.frontRight);

		
	}
	public static void repair(Tire tire) {
		
		if(tire instanceof HankookTire) {
		System.out.println(((HankookTire)tire).company + "수리 합니다.");
		}
		if(tire instanceof KumhoTire) {
			System.out.println(((KumhoTire)tire).company + "수리 합니다.");
			}
		
		}

}

class Car{
	//인터페이스를 이용한 멤버변수(필드)의 다형성 예제 
	Tire frontLeft = new HankookTire();
	Tire frontRight = new KumhoTire();
}

interface Tire{
	void roll(); //바퀴가 구르는 기능
	
}

class KumhoTire implements Tire{
	String company = "금호";
	public void roll() {
		System.out.println("금호 타이어가 굴러 갑니다.");
	}
}
		
class HankookTire  implements Tire{
	String company = "한국";
	public void roll() {
		System.out.println("한국 타이어가 굴러 갑니다.");
	}
}