package Array;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {

		/*
		 * StringBuffer s=new StringBuffer("java"); int b=s.length();
		 * System.out.println(b); int a =s.capacity(); System.out.println(a);
		 */
		// TODO Auto-generated method stub
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter String size");
		 * int a=sc.nextInt(); int b[]=new int[a]; System.out.println("Enter element ");
		 * for(int i=0;i<a;i++) { b[i]=sc.nextInt();
		 * 
		 * } for(int i=a;i<a-1 ;i--) {
		 * 
		 * 
		 * for(int j=0;j<a;j++) { //int t=0; b[i]=b[j];
		 * 
		 * }
		 * 
		 * System.out.println(b[i]);
		 * 
		 * // int
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 */

		
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("Enter array size");
		  int a=sc.nextInt(); 
		  int b[]=new int[a];
		 
		  
		  for(int i=0;i<a;i++) {
		  
		  b[i]=sc.nextInt();
		  
		  
		  } for(int left =0,right=b.length-1;left<right;left++,right--) {
		  
		 
		  
			  int temp=b[left];
			  b[left]=b[right];
			  b[right]=temp;
		 
			/*
			 * String s1 = new String("abc"); String s2 = new String("");
			 */
	
			//  System.out.println(b);
		  }
		  for(int i=0;i<b.length;i++) {
			
			  System.out.println(b[i]);
		  }
	
		/*
		 * for(int c:b) {
		 * 
		 * 
		 * System.out.println(c); }
		 */
		  
	}
	
}


