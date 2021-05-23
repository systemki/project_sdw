package day18;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ListTest2 {

	public static void main(String[] args) {
		/*오늘의 할일을 저장하는 리스트를 생성한후 오늘의 할일을 입력받고, 
		다받은 후에 출력하는 하는 코드를 작성하세요  
		오늘의 할일은 종료를 입력하면 종료하고 출력하면 됩니다.
		예시 
		오늘의 할일 입력 : 출근
		오늘의 할일 입력 : 오전수업
		오늘의 할일 입력 : 점심
		오늘의 할일 입력 : 오후수업
		오늘의 할일 입력 : 퇴근
		오늘의 할일 입력 : 종료
						
         1. 출근
         2. 오전수업
         3. 점심
         4. 오후 수업
         5. 퇴근 
           			
		*/ 

		
//		오늘의 할일을 저장할 list생성
		ArrayList<String> list = new ArrayList<String>();
		
		//Scanner 객체를 생성
		Scanner scan = new Scanner (System.in);
		
		while(true) {
			System.out.println("오늘의 할일 입력 ");
			String str = scan.next();
			if(str.equals("종료")) {
				break;
				
			}
			list.add(str);
		} 	
		for(int i = 0; i <list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i));
		}
				
		scan.close();
	}

}
