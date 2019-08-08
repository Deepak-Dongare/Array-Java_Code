package Array;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Array size");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("Enter element");
		for(int i=0;i<a;i++) {
			
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<a;i++) {
			
			for(int j=i+1;j<a;j++)
			/*
			if(b[i]>b[j]) {
				
					
					 * int temp; temp=b[i]; //b[i]=temp; b[j]=b[i]; b[i]=temp;
					 
				int  temp = b[i];  
                 b[i] = b[j];  
                 b[j] = temp;  
				
				
			}*/
			if(b[i]<b[j]) {  
				
				int temp=b[j];
				b[j]=b[i];
				b[i]=temp;
			}
			
			
		}for(int i=0;i<a;i++) 
		{
			System.out.println(b[i]);
		}
		

	}

}
