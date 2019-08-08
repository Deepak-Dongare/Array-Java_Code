package Array;

import java.util.Scanner;

public class HW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			
			array[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(array[i]>array[j]) {
					
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
					System.out.println(array[j]);
				}
				
			}
			//return array[i];
		}
		
		

	}

}
