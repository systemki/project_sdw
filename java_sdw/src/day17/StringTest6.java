package day17;

public class StringTest6 {

	public static void main(String[] args) {
		
		
		System.out.println("Hello" .toLowerCase());
		System.out.println("Hello" .toUpperCase());
		//trim() 예제 
		String str = "\n\n\n 안녕하세요  \n\n\n ";
		System.out.println("trim()전 str");
		System.out.println(str);
		System.out.println("trim()후 str");
		System.out.println(str.trim());		
		String num1 = ""+1;
		System.out.println(num1);
		String num2 = String.valueOf(1);
		System.out.println(num2);
	}

}
