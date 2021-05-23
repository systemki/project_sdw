package day7;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		gcd1(7);
		System.out.println();
		gcd1(1);
		gcd2(2);
		System.out.print(gcd2(3));
		System.out.println();
		System.out.println(sum1(2,4));
		sum2(4,4);
		System.out.println(num99(2)); 

	

	}

    public static void gcd1(int i){

    	for(int sum =1 ; sum <= 9 ; sum++) {
  
    		System.out.println("구구단 : "  + i + " X "+ sum + " = " + i*sum);		

    	}
    }

    public static int gcd2(int i) {
    	for(int sum =1 ; sum <= 9 ; sum++) {
    		System.out.println("구구단 : "  + i + " X "+ sum + " = " + i*sum);
    	}
    	return i;
    	
    }
    
    	// 두합을 알려주는 메소드 
    public static int sum1(int x, int z){
    	int pu = x + z;
    	int ko = pu;
    	return pu;
    }
    	// 두합을 알려 출력 하는 
    public static void sum2(int x, int z) {
    	int pu = x + z;
    	System.out.println("두합"+pu);
    }
     
    public static int num99(int num) {
    	int i= 0;
    	for(;  i <9 ; i+=1 ) {	    
    		num = i;
    				
    	} return num;

    }
}
