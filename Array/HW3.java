package Array;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int a=sc.nextInt();
		int b[]=new int[a] ;
		boolean visited[] = new boolean[a]; 
		
		for(int i=0;i<a;i++) {
			
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<a;i++) {
			int count=1;
			for(int j=i+1;j<a-1;j++) {
				
				if(b[i]==b[j]) {
					
					//b
					count++;
					b[j]=0;
					
					
				}
				
				
				
			}
			if(b[i]!=0)
			{
				System.out.println(b[i] +count);
				
			}
			
	}
		
			}

}
