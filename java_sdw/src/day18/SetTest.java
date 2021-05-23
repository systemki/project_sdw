package day18;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		//* Set 메소드 예제 
		 HashSet<Integer> set = new HashSet<Integer>();
		 // add(객체) : set에 객체를 추가
		 // add(번지,객체) 
		 set.add(10);
		 set.add(50);
		 set.add(20);
		 set.add(17);
		 set.add(42);
		 set.add(40);
		 set.add(10);
		 
		 
		 //size() : set의 크기 
		 System.out.println("set의 크기 : " + set.size());
		 //contains(객체) : 객체가 있는지 없는지 화인
		System.out.println("set에 10이 있습니까?" + set.contains(10));
		System.out.println("set에 11이 있습니까?" + set.contains(11));
		//isEmpty(): set이 비었는지 아닌지 확인
		System.out.println("set이 비어 있습니까?" + set.isEmpty());
		
		Iterator<Integer> it = set.iterator();
		         //hasNext 다음에 선택할 요소가 있는지 알려주는 메소드 
		while(it.hasNext()) {
			Integer tmp = (Integer) it.next();
			System.out.println(tmp+" ");
		}
		System.out.println();
		//remove(객체) : 객체와 일치하는 내용을 삭제하고 삭제 성공 여부를 알림 
		System.out.println("set에 10의 값이 삭제 되었습니까?" + set.remove(10));
		System.out.println("set에 10의 값이 삭제 되었습니까?" + set.remove(101));
		//clear() : 비움
		set.clear();
		System.out.println("set의 크기 : " + set.size());
		
	}

}
