package test;

public class Test2 {

	public static void main(String[] args) {
		int i, min = 1, max = 45;
		int arr[] = new int[7];
		
		for(i = 1; i < arr.length; i+=1) {
			int r =(int)(Math.random() * (max - min + 1) +min);			
				arr[i] = r;
				System.out.print("  " +  arr[i]);
		}			 
		

	}

}
