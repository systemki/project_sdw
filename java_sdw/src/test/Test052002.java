package test;

import java.util.Scanner;

public class Test052002 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		System.out.println("신동우 입니다." .substring(1,4));
					   	//  0123 456  
		System.out.println("주민번호 : 입력하셈 ");
		Scanner scan = new Scanner (System.in);
		String num = scan.next();
		String year = num.substring(0,2);
		String gen = num.substring(2,3);
		System.out.println(gen+ "이거 뭐라고 나옴");
//		switch(gen) {
//		case "1", "2" : 
//			year = "19" + year;
//			break;
//		case "3","4" :
//			year = "20" +year;
//			break;
//		}
		
		if(num.substring(2,3).equals("2")) {
			System.out.println("19" + year);
		}else if(num.substring(2,3).equals("3")) {
			System.out.println("20" + year);

		}else if(num.substring(2,3).equals("4")){
			System.out.println("프로그램 종료 ");
		}else {
			System.out.println("프로그램종료 합니다.");
		}
			
	
		
		System.out.println(year);
		
		scan.close();
	}	

}
