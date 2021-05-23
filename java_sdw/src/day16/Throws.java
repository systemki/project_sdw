package day16;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void test() throws Exception{
		throw new Exception("test 메소드 에서 예외 발생");
		
	}
}
