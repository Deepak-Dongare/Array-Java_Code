package Array;

import java.util.Scanner;

public class HW11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		
		int array[]= new int[size];
		System.out.println("Enter Array elemnet");
		
		for(int i=0;i<size;i++)
		{
			
			 array[i]=sc.nextInt();
		}
		System.out.println("Even no are:");
		for(int i=0;i<size;i++) {
			
			if((array[i]%2)==0) {
				
				System.out.println(""+array[i]);
				
			
				
			}
			/*else {
				array[i]=0;
			}*/
			
		
		}
		System.out.println("Odd no are");
		for(int i=0;i<size;i++) {
			
			if(array[i]%2!=0) {
				
				System.out.println(""+array[i]);
			
			}
			/*else {
				array[i]=0;
			}*/
		}
		
		
		
	}

}
