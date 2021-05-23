package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		// Map 예제
		HashMap<String, String> map = new HashMap<String, String>();
		//put(key, value) : key와 value의 값을 저장 
		//key값이 중복되지 않으면 null을 리턴 하고, 중복되면 이전에 저장된
		//값을 리턴 
		System.out.println(map.put("과일", "사과"));
		System.out.println(map.put("과일", "포도"));
		//map.containsKey(객체) : key값에 객체와 일치하는 정보가 있는지 업는지 알려줌
		//containsValue(객체) : Value값에 객체와 일치하는 정보가 있는지 없는 알려줌
		System.out.println("Key에 과일이 있습니까? " + map.containsKey("과일"));
		System.out.println("Key에 포도이 있습니까? " + map.containsKey("포도"));
		System.out.println("Value에 과일이 있습니까? " + map.containsValue("과일"));
		System.out.println("Value에 포도이 있습니까? " + map.containsValue("포도"));
		//get(객체) : key값이 객체와 일치하는 정보의 Value값을 가져옴
		System.out.println("Value에 포도이 있습니까? " + map.get("과일"));
		map.put("학용품", "연필");
		map.put("탈것", "자전거");
		map.put("전자기기", "스마트폰");
		// 방법1 : set을 이용하여 Iterator를 사용 
		//key값들을 셋으로 만든 후 Iterator
		// KeySet() : 맵의 key값들을 하나의 Set으로 만들어주는 메소드 
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
		/*방법2 : set이용하여 Iterator를 사용 
		 *  key값과 value값을 가지고 하나의 클래스인 Entry클래스를 이용하는 방법
		 *  entrySet() : Entry클래스를 이용한 Set을 반환
		 */
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Map.Entry<String,String> tep = it2.next();
			String key = tep.getKey();
			String value = tep.getValue();
			System.out.println(key + " : " + value);
		}
	}
	
}

class Entry{
	String key;
	String value;
}
