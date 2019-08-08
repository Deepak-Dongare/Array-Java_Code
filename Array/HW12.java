package Array;

import java.util.Scanner;

public class HW12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		System.out.println("Enter Array element");
		
		int a[]=new int[1];
		
		int max= a[0];
		int min=a[0];
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
			
			
		}
		
		for(int i=0;i<size;i++) {
			
			//for(int j=1;j<size;j++) 
			{
			
				if (array[i] > max) 
				{
					max = array[i];
				}
				if (array[i] < min) 
				{
					min = array[i];
				}
					
				
					
			}
			
			
			}
		System.out.println(max);
		System.out.println(min);
		}
		

	}


