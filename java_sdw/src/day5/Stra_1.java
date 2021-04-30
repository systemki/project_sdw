package day5;

public class Stra_1 {

	public static void main(String[] args) {
		/* *****  k = 1
		 ***** 	k = 2
		 ***** 	k = 3
		 *****  k = 4
		 *****  k = 5  
		 */
		
	
	/*	
		for(k = 1 ; k <= 5 ; k+=1 ) {
			for(i = 1; 1 <= 5 ; i+=1) {
				System.out.print("*");
			}
			System.out.print();
		}
*/
		
		int i, k;
		System.out.println("--------------------");
		for(k = 1 ; k <= 5 ; k+=1) {
			for(i=1 ; i <= k ; i+=1 ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *****  k = 1  공백=4*=4
		 ***** 	k = 2	 공백=4*=4
		 ***** 	k = 3	 공백=4*=4
		 *****  k = 4	 공백=4*=4
		 *****  k = 5 	 공백=4*=4 
		 */
		
		
		System.out.println("--------------------");
		for(k = 1 ; k <= 5 ; k+=1) {
			for(i=1 ; i <= 4 ; i+=1 ) {
				System.out.print("  ");
			}
			System.out.println(  "*");
		}
		/*     * k=1 공=4	*=1 
		 *    ** k=2 공=3	*=2
		 *   *** k=3 공=2	*=3
		 *  **** k=4 공=1	*=4
		 */
		
		System.out.println("--------------------");
		for(k = 1 ; k <= 5 ; k+=1) {
			//공백 출력
			for(i = 1 ; i <= 5 - k ; i+=1 ) {
				System.out.print(" ");
			}
			for(i = 1;  i <= k ; i +=1) {
				System.out.print("*");
			}
		System.out.println();
		}
		 /*     
		  *      *
		  *     ***
		  *    *****
		  *   *******
		  *  
		  *   ********
		  *    ******
		  *     ***
		  *      *
		  */
		
	}

}
