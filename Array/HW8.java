package Array;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int a=sc.nextInt();
		

		int b[]= new int [a+1];
		
		System.out.println("Enter elemnt ");
		
		for(int i=0;i<a;i++) {
			
			b[i]=sc.nextInt();
			
			
		} /*
			 * for(int i=0;i<a;i++) { //System.out.println(b[i]); }
			 */
		System.out.println("Enter postion number");
		int n=sc.nextInt();
		System.out.println("Enter elment ");
		
		int e=sc.nextInt();
	

		for(int i=a-1;i>=(a-1);i--) {
			
			/*
			 * for(int j=0;j<a;j++) {
			 * 
			 * 
			 * 
			 * b[i]=sc.nextInt();
			 * 
			 * System.out.println("Enter number"); int n=sc.nextInt();
			 * 
			 * //for(int j=0)
			 * 
			 * 
			 * 
			 * // System.out.println(b[i]++);
			 * 
			 * }
			 * 
			 */
			b[i+1]=b[i];
		}
		b[n-1]=e;
	
		for(int i=0;i<a;i++) {
			
			
			 System.out.println(b[i]); 
			
		}
			
	}

}
