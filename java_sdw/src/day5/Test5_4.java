import java.util.Scanner;

public class Test5_4 {

	public static void main(String[] args) {
		 /* 학생 3명의 성적을 입력 받은후 총 점과 평균을 출력하는 코드를 작성하세요
		  */
		Scanner scan = new Scanner (System.in);
		int i;
		int avg;
		int [] arr =new int[3];
		for(i = 0; i < arr.length ; i +=1 ) {
			System.out.println("성적을 입력하세요");
			arr[i] = scan.nextInt();
			
			 System.out.println("총점 : " + (arr[0] + arr[1]  + arr[2])  );
		}	double avg = (double)arr.length / i;	
		System.out.print("평균" + (avg));

		scan.close();
		
		
	}

}
