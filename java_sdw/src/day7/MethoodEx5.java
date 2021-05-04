package day7;

public class MethoodEx5 {

	public static void main(String[] args) {
		printChar1('*', 5);
		System.out.println(printChar2('*',5));
		System.out.println(printChar2('*',3)+printChar2('-));
		//	기능 : *****엔터 을 출력 하는 메소드 생성 하여 테스트 해보세요.
	}  

	/*  메개변수 :  문자, 정수번(횟수) = char ch, int cont
		리턴타입 :  없음 보이드 >  void 
		메소드명 : printChar1
		
	*/	
					//리턴x
	public static void printChar1(char ch, int count){
		for(int i = 0; i  <count  ; i+=1) {
			System.out.println(ch);
		} 
		System.out.println();
	}
	
	/*  메개변수 :  문자, 정수번(횟수) = char ch, int cont
	리턴타입 :  문자열
	메소드명 : printChar2 >String
	
*/	
	public static String printChar2(char ch, int count) {
		String str = "";
		// 문자열 + 문자 > 문자열
		for(int i = 0; i<count; i+=1) {
			// i=0 "" + '*' > "*"
			// i=1 "*" + '*' > "**"
//			i=count-1 "**...**" + '*' > *...*"" (*count개)
			str = str + ch;
		}
		return str;
	}
	
	
}
