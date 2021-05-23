package day17;

import java.util.Scanner;
	//charAt()메소드 예제 
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자를 입력");
		Scanner scan = new Scanner(System.in);
		//char = op = scan.next().charAt(0);
		//Scanner 클래스에서 제공하는 next()라는 메소드를 통해 콘솔에서 입력받은 문자열을
		// 가줘옴 
		String str = scan.next();
		//String 클래스에서 제공하는 charAt()라는 메소드를 통해 0번지에 있는 문자를 
		// 가줘옴 
			char op = str.charAt(0);
			System.out.println("입력문자 : " + op);
			
			scan.close();
			
	}

}
