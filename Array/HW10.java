package Array;

import java.util.Scanner;

public class HW10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Array size");
		int n=sc.nextInt();
		
		System.out.println("Enter Frist  Array Element  ");
		
		int array1[]=new int[n] ;
		for(int i=0;i<n;i++) {
			
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter  Second Array size");
		int n1=sc.nextInt();
		
		System.out.println("Enter second Array Element");
		
		int array2[]=new int[n1];
		for(int i=0;i<n;i++) {
			
			array2[i]=sc.nextInt();
		}
		
		 int n3=n+n1; 
		
		//int array3[]=new int[array1.length];
		 int array3[]=new int[array1.length];
		 
		for(int i=0;i<n3/*array3.length*/;i++) {
			
			
			
			array3[i]=array1[i]+array2[i];
			
		}
		
				for(int i=0;i<n3/*array3.length*/;i++) {
			
						//array3[i];
				System.out.println(array3[i]);
				
				}
		}
		
	}


