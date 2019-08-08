package Array;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int a=sc.nextInt();
		int b[]=new int [a];
		System.out.println("Enter element");
		for(int i=0;i<a;i++) {
			
			b[i]=sc.nextInt();
					
	
		 {
			
			if(b[i]%2==0) {
				System.out.println("even"+b[i]);
				
			}
			if(b[i]%2 !=0) {
				
				System.out.println("odd"+b[i]);
			}
			if(b[i]>0) {
				System.out.println("positive "+b[i]);
				
			}
			if(b[i]<0) {
				System.out.println("negative"+b[i]);
			}
		}
		/*for(int i=0;i<a;i++) 
		{
			if(b[i]%2==0) 
			{
				//System.out.println(b[i]+"even number ");
			}
			System.out.println(b[i]+"::even number ");
		
		}
		for(int i=0;i<a;i++) {
			
		if(b[i]%2!=0) {
			
			System.out.println(b[i]+"::odd number");
		}
		
		}for(int i=0;i<a;i++) {
			
			if(b[i]>0) {
				System.out.println(b[i]+"positive number ");
			}
			
		}
		for(int i=0;i<a;i++) {
			if(b[i]<0)
			System.out.println(b[i]+"negative");
		}
			

*/
		
	
			}
		}
}
