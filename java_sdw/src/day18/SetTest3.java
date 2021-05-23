package day18;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		/* 중복되지 않는 6개의 수를 램덤으로 생성하여 저장한 후 출력하는 코드를 
		 * 작성하세요. 단 숫자의 범위 1~45
		 */

		//필요한 객체 생성
		 HashSet<Integer> set = new HashSet<Integer>();		
		 int min = 1, max = 45;
		 //램덤으로 중복되지 않는 6개의 수를 생성 하여 저장 
		 while(set.size()<6) {
			 Integer num = (int)(Math.random()*(max - min + 1) +min);
			 set.add(num);
			 
		 }
		 System.out.println("로또 : ");
		 // 출력
		 Iterator<Integer> it = set.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next()+ " ");
		 }
		 
		 
	}

}
