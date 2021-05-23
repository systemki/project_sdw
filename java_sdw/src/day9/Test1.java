package day9;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int arr[] = new int [4];
		System.out.println("입력하세요 :");
		for(int i =0 ;i<arr.length; i++) {
			arr[i] = scan.nextInt();
		 if(arr[i] < 40) {
			 System.out.println("인생에 망했음..");
		 }else if(arr[i] < 70) {
			 System.out.println("인생 들 망했음");
		 }else if(arr[i] < 90) {
			 System.out.println("괜찮은 인생임");
		 }else {
			 System.out.println("최고!");
			 
		 }
			
		} 

	}

}
