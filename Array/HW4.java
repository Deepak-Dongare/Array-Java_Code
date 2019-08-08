package Array;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Enter the String size");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int e=a+a;
		int b[]=new int[a];
		int c[]=new int[a];
		int d[]=new int[e];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.println(b[i]);
		}
		System.out.println("Enter the second String ");
		for(int i=0;i<a;i++) {
			
			c[i]=sc.nextInt();
				
		}
		for(int i=b.length-1;i>=0;i--) {
			
			System.out.println(b[i]);
		}
		
		

	}

}
