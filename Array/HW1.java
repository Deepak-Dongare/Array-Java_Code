package Array;

import java.util.Scanner;

class Accept {
	

	void accept(){}
		
	
}
public  class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
		int b=sc.nextInt();
		int a[]=new int[b];
		//int sum = 0;
		System.out.println("Enter element");
		for(int i=0;i<b;i++ ) {
			
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		int sum = 0;
		for(int i=0;i<b;i++) {
			//int sum=0;
			System.out.println("Elements"+a[i]);
			
		  sum =sum+a[i];
		// System.out.println(sum);
		  
		}
		
		System.out.println("::"+sum);
		int avg=sum/b;
		System.out.println("AVERAGE OF ALL ELEMENTS IN AN ARRAY "+avg);
	//	new accept();
	}

}
