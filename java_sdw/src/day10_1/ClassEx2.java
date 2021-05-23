package day10_1;

import day10.A;
import day10.B;
import day10.C;
import day10.D;
import day10.ClassEx1; // day10패키지에 있는 클래스 ClassEx1을 가져오려 한다.


public class ClassEx2 {

	public static void main(String[] args) {
		
		
		A a = new A(); //public 이기 떄문에 에러가 발생하지않음
		a.num = 10;
		B b = new B(); //protected : 클래스 B와 ClassEx1은 같은 패키지에 있기 떄문에 에러발생 하지 않음 
		b.num = 10;
		C c = new C(); // 디폴트 C와 ClassEx1은 같은 패키지에 있기 떄문에 에러 발생하지 않음 
		c.num =10;
		D d = new D();
		d.setNum (10); //에러 발생 num의 접근제한자가 private이어서 

}
}
